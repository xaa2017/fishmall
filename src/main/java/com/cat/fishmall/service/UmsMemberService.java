package com.cat.fishmall.service;

import com.cat.fishmall.common.api.CommonResult;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
public interface UmsMemberService {
	/**
	 * 生成验证码
	 * @param telephone
	 * @return
	 */
	CommonResult<String> generateAuthCode(String telephone);

	/**
	 * 校验验证码是否正确
	 * @param telephone
	 * @param authCode
	 * @return
	 */
	CommonResult<Void> verifyAuthCode(String telephone, String authCode);
}
