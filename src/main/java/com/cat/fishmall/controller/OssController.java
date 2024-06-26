package com.cat.fishmall.controller;

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.dto.OssCallbackResult;
import com.cat.fishmall.dto.OssPolicyResult;
import com.cat.fishmall.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: xiaoanan
 * @Date: 2024/4/3
 * @Version: V1.0
 * @Description:
 **/
@RestController
@Api(tags = "OssController", description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {
	@Autowired
	private OssServiceImpl ossService;

	@ApiOperation(value = "oss上传签名生成")
	@GetMapping(value = "/policy")
	public CommonResult<OssPolicyResult> policy() {
		OssPolicyResult result = ossService.policy();
		return CommonResult.success(result);
	}

	@ApiOperation(value = "oss上传成功回调")
	@PostMapping(value = "callback")
	public CommonResult<OssCallbackResult> callback(HttpServletRequest request) {
		OssCallbackResult ossCallbackResult = ossService.callback(request);
		return CommonResult.success(ossCallbackResult);
	}
}
