package com.cat.fishmall.service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
public interface RedisService {
	/** 设置key
	 *
	 * @param key
	 * @param value
	 */
	void set(String key, String value);

	/**
	 * 获取key
	 * @param key
	 * @return
	 */
	String get(String key);

	/**
	 * 设置key过期
	 * @param key
	 * @param expire
	 * @return
	 */
	boolean expire(String key, long expire, TimeUnit timeUnit);

	/**
	 * 删除数据
	 * @param key
	 */
	void remove(String key);

	/**
	 * 自增操作
	 * @param key
	 * @param delta 自增步长
	 * @return
	 */
	Long increment(String key, long delta);
}
