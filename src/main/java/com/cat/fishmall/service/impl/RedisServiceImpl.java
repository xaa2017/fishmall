package com.cat.fishmall.service.impl;

import com.cat.fishmall.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public void set(String key, String value) {
		stringRedisTemplate.opsForValue().set(key, value);
	}

	@Override
	public String get(String key) {
		return stringRedisTemplate.opsForValue().get(key);
	}

	/**
	 *
	 * @param key
	 * @param expire
	 * @return
	 */
	@Override
	public boolean expire(String key, long expire,  TimeUnit timeUnit) {
		return stringRedisTemplate.expire(key, expire, timeUnit);
	}

	@Override
	public void remove(String key) {
		stringRedisTemplate.delete(key);
	}

	@Override
	public Long increment(String key, long delta) {
		return stringRedisTemplate.opsForValue().increment(key, delta);
	}
}
