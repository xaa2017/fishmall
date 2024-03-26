package com.cat.fishmall.service.impl;

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.service.RedisService;
import com.cat.fishmall.service.UmsMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
@Service
@Slf4j
public class UmsMemberServiceImpl implements UmsMemberService {

	@Autowired
	private RedisService redisService;

	@Value("${redis.key.prefix.authCode}")
	private String REDIS_KEY_PREFIX_AUTH_CODE;

	@Value("${redis.key.expire.authCode}")
	private String REDIS_KEY_EXPIRE_AUTH_CODE;

	private int authCodeLength = 6;

	private int authCodeExpireSeconds = 60;
	@Override
	public CommonResult<String> generateAuthCode(String telephone) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < authCodeLength; i++) {
			sb.append(random.nextInt(10));
		}
		redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
		redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, authCodeExpireSeconds, TimeUnit.SECONDS);
		log.info("验证码是 {}", sb);
		return CommonResult.success(sb.toString(), "验证码生成成功");
	}

	@Override
	public CommonResult<Void> verifyAuthCode(String telephone, String authCode) {
		String authCodeInRedis = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
		if (authCode.equals(authCodeInRedis)) {
			return CommonResult.success(null);
		}
		return CommonResult.failed("验证码错误");
	}
}
