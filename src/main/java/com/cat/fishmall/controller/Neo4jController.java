package com.cat.fishmall.controller;

import com.cat.fishmall.mbg.model.Greet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: xiaoanan
 * @Date: 2024/3/26
 * @Version: V1.0
 * @Description:
 **/
@RestController
@Api(tags = "Neo4jController")
@RequestMapping("/sso")
public class Neo4jController {



	@ApiOperation("获取超流体响应")
	@RequestMapping(value = "/getHyper", method = RequestMethod.GET)
	public Greet getHyper(@RequestParam(name = "telephone")String telephone) {
		Greet greet = new Greet();
		greet.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(Neo4jController.class).getHyper(telephone)).withSelfRel());
		return greet;
	}


}
