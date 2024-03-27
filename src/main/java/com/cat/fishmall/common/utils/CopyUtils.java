package com.cat.fishmall.common.utils;

import cn.hutool.core.bean.BeanUtil;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
public class CopyUtils {

	public static void copy(Object source, Object target) {
		BeanUtil.copyProperties(source, target);
	}

}
