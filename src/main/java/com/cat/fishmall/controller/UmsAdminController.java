package com.cat.fishmall.controller;

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.dto.TokenDto;
import com.cat.fishmall.dto.UmsAdminLoginParam;
import com.cat.fishmall.mbg.model.UmsAdmin;
import com.cat.fishmall.mbg.model.UmsPermission;
import com.cat.fishmall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@RestController
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
	@Autowired
	private UmsAdminService adminService;
	@Value("${jwt.tokenHeader}")
	private String tokenHeader;
	@Value("${jwt.tokenHead}")
	private String tokenHead;

	@ApiOperation(value = "用户注册")
	@PostMapping(value = "/register")
	public CommonResult<UmsAdmin> register(@RequestBody  @Valid UmsAdmin umsAdminParam) {
		UmsAdmin admin = adminService.register(umsAdminParam);
		if (admin == null) {
			return CommonResult.failed();
		}
		return CommonResult.success(admin);
	}

	@ApiOperation(value = "登录以后返回token")
	@PostMapping(value = "/login")
	public CommonResult<TokenDto> login(@RequestBody @Valid UmsAdminLoginParam umsAdminLoginParam) {
		String token = adminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
		if (token == null) {
			return CommonResult.validateFailed("用户名或密码错误");
		}
		TokenDto tokenDto = new TokenDto();
		tokenDto.setToken(token);
		tokenDto.setTokenHead(tokenHead);
		return CommonResult.success(tokenDto);
	}

	@ApiOperation("获取用户所有权限（包括+-权限）")
	@GetMapping(value = "/permission/{adminId}")
	public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
		List<UmsPermission> permissionList = adminService.getPermissionList(adminId);
		return CommonResult.success(permissionList);
	}

}
