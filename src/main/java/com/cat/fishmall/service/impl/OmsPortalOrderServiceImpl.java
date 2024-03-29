package com.cat.fishmall.service.impl;

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.component.CancelOrderSender;
import com.cat.fishmall.dto.OrderParam;
import com.cat.fishmall.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/29
 * @Version: V1.0
 * @Description:
 **/
@Service
@Slf4j
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {

	@Autowired
	private CancelOrderSender cancelOrderSender;

	@Override
	public CommonResult generateOrder(OrderParam orderParam) {
		Random random = new Random();
		Long orderId = Long.valueOf(random.nextInt(100));
		log.info("生成订单：{}",orderId);
		this.sendDelayMessageCancelOrder(orderId);
		return CommonResult.success(orderId, "下单成功");
	}

	@Override
	public void cancelOrder(Long orderId) {
		log.info("取消订单：{}",orderId);
	}

	private void sendDelayMessageCancelOrder(Long orderId) {

		long delayTimes = 30 * 1000;// 单位是 毫秒
		cancelOrderSender.sendMessage(orderId, delayTimes);
	}
}
