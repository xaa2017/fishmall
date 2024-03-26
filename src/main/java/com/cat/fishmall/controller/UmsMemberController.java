package com.cat.fishmall.controller;

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
@RestController
@Api(tags = "UmsMemberController", description = "会员注册登录")
@RequestMapping("/sso")
public class UmsMemberController {

	@Autowired
	private UmsMemberService memberService;

	@ApiOperation("获取验证码")
	@RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
	public CommonResult<String> getAuthCode(@RequestParam(name = "telephone")String telephone) {
		return memberService.generateAuthCode(telephone);
	}

	@ApiOperation("校验验证码是否正确")
	@GetMapping("/verifyAuthCode")
	public CommonResult<Void> updatePassword(@RequestParam(name = "telephone")String telephone, @RequestParam(name = "authCode") String authCode) {
		return memberService.verifyAuthCode(telephone, authCode);
	}

}
