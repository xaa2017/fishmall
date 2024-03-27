package com.cat.fishmall.service.impl;

import com.cat.fishmall.common.utils.CopyUtils;
import com.cat.fishmall.common.utils.JwtTokenUtil;
import com.cat.fishmall.mbg.mapper.UmsAdminMapper;
import com.cat.fishmall.mbg.mapper.UmsAdminRoleRelationMapper;
import com.cat.fishmall.mbg.model.UmsAdmin;
import com.cat.fishmall.mbg.model.UmsPermission;
import com.cat.fishmall.service.UmsAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@Service
@Slf4j
public class UmsAdminServiceImpl implements UmsAdminService {

	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Value("${jwt.tokenHead}")
	private String tokenHead;
	@Autowired
	private UmsAdminMapper adminMapper;
	@Autowired
	private UmsAdminRoleRelationMapper adminRoleRelationMapper;

	@Override
	public UmsAdmin getAdminByUsername(String username) {
		return adminMapper.selectByUserName(username);
	}

	@Override
	public UmsAdmin register(UmsAdmin umsAdminParam) {
		String username = umsAdminParam.getUsername();
		UmsAdmin existUser = this.getAdminByUsername(username);
		if (existUser != null) {
			return null;
		}
		String encodePassword = passwordEncoder.encode(umsAdminParam.getPassword());
		UmsAdmin umsAdmin = new UmsAdmin();
		CopyUtils.copy(umsAdminParam, umsAdmin);
		umsAdmin.setStatus(1);
		umsAdmin.setCreateTime(new Date());
		umsAdmin.setPassword(encodePassword);
		adminMapper.insert(umsAdmin);
		return umsAdmin;
	}

	@Override
	public String login(String username, String password) {
		String token = null;
		try {
			UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			if (!passwordEncoder.matches(password, userDetails.getPassword())) {
				throw new BadCredentialsException("密码不正确");
			}
			UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
			//principal 用户身份信息 credentials 用户凭证信息 ，可以分别放username password
			//UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
			SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			token = jwtTokenUtil.generateToken(userDetails);
		} catch (Exception e) {
			log.error("登录异常{}", e.getMessage());
		}
		return token;
	}

	@Override
	public List<UmsPermission> getPermissionList(Long adminId) {

		return adminRoleRelationMapper.getPermissionList(adminId);
	}
}
