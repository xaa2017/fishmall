package com.cat.fishmall.service;

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理service
 * @Author: xiaoanan
 * @Date: 2024/3/29
 * @Version: V1.0
 * @Description:
 **/
public interface OmsPortalOrderService {

	/**
	 * 根据提交信息生成订单
	 */
	@Transactional
	CommonResult generateOrder(OrderParam orderParam);

	/**
	 * 取消单个超时订单
	 */
	@Transactional
	void cancelOrder(Long orderId);

}
