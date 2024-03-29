package com.cat.fishmall.config;

import com.cat.fishmall.enums.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 消息队列配置
 * @Author: xiaoanan
 * @Date: 2024/3/29
 * @Version: V1.0
 * @Description:
 **/
@Configuration
public class RabbitMqConfig {

	/**
	 * 订单实际消费队列绑定的交换机
	 * @return
	 */
	@Bean
	DirectExchange orderDirect() {
		return (DirectExchange) ExchangeBuilder
				.directExchange(QueueEnum.QUEUE_ORDER_CANCEL.getExchange())
				.durable(true)//消息持久化
				.build();
	}

	/**
	 * 订单延迟队列所绑定的交换机
	 * @return
	 */
	@Bean
	DirectExchange orderTtlDirect() {
		return (DirectExchange) ExchangeBuilder
				.directExchange(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange())
				.durable(true)//消息持久化
				.build();
	}

	/**
	 * 订单实际消费队列
	 * @return
	 */
	@Bean
	public Queue orderQueue() {
		return new Queue(QueueEnum.QUEUE_ORDER_CANCEL.getName());
	}

	/**
	 * 订单延迟队列（死信队列）
	 * 先给ttl队列发消息，但是这些消息没有消费者，等到消息过期后再转发给真正的订单取消消费者
	 * @return
	 */
	@Bean
	public Queue orderTtlQueue() {
		return QueueBuilder.durable(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getName())
				.withArgument("x-dead-letter-exchange", QueueEnum.QUEUE_ORDER_CANCEL.getExchange())// 到期后转发的交换机
				.withArgument("x-dead-letter-routing-key", QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey())//到期后转发的路由键
				.build();
	}

	/**
	 * 订单队列绑定关系
	 * @param orderDirect
	 * @param orderQueue
	 * @return
	 */
	@Bean
	Binding orderBinding (DirectExchange orderDirect, Queue orderQueue) {
		return BindingBuilder.bind(orderQueue).to(orderDirect).with(QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey());
	}
	/**
	 * 订单延迟队列绑定关系
	 * @param orderTtlDirect
	 * @param orderTtlQueue
	 * @return
	 */
	@Bean
	Binding orderTtlBinding (DirectExchange orderTtlDirect, Queue orderTtlQueue) {
		return BindingBuilder.bind(orderTtlQueue).to(orderTtlDirect).with(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey());
	}
}
