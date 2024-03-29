package com.cat.fishmall.component;

import com.cat.fishmall.enums.QueueEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
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
public class CancelOrderSender {
	@Autowired
	private AmqpTemplate amqpTemplate;

	public void sendMessage(Long orderId, long delayTimes) {
		//给延迟队列发送消息
		amqpTemplate.convertAndSend(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange(),  QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey(), orderId, message -> {
			message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
			return message;
		});
		log.info("send message orderId:{}", orderId);
	}
}
