package com.cat.fishmall.controller;

import com.cat.fishmall.dto.OrderParam;
import com.cat.fishmall.service.OmsPortalOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单管理Controller
 * Created by macro on 2018/8/30.
 */
@RestController
@Api(tags = "OmsPortalOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsPortalOrderController {
	@Autowired
	private OmsPortalOrderService portalOrderService;

	@ApiOperation("根据购物车信息生成订单")
	@PostMapping(value = "/generateOrder")
	public Object generateOrder(@RequestBody OrderParam orderParam) {
		return portalOrderService.generateOrder(orderParam);
	}

}

