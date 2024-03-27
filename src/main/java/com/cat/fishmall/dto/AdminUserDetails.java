package com.cat.fishmall.dto;

import com.cat.fishmall.mbg.model.UmsAdmin;
import com.cat.fishmall.mbg.model.UmsPermission;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@Data
public class AdminUserDetails implements UserDetails {

	private UmsAdmin admin;

	private List<UmsPermission> permissionList;

	public AdminUserDetails(UmsAdmin admin, List<UmsPermission> permissionList) {
		this.admin = admin;
		this.permissionList = permissionList;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//返回当前用户的权限
		return permissionList.stream().filter(permission-> permission.getValue() !=null)
				.map(permission-> new SimpleGrantedAuthority(permission.getValue()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return admin.getPassword();
	}

	@Override
	public String getUsername() {
		return admin.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return admin.getStatus().equals(1);
	}
}
