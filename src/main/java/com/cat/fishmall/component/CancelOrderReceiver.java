package com.cat.fishmall.component;

import com.cat.fishmall.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 取消订单消息的发送者
 *
 * @Author: xiaoanan
 * @Date: 2024/3/29
 * @Version: V1.0
 * @Description:
 **/
@Component
@Slf4j
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {
	@Autowired
	private AmqpTemplate amqpTemplate;

	@Autowired
	private OmsPortalOrderService portalOrderService;

	@RabbitHandler
	public void handler(Long orderId) {
		log.info("receiver delay message orderId:{}", orderId);
		portalOrderService.cancelOrder(orderId);
	}
}
