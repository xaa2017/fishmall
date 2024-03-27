package com.cat.fishmall.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@Data
public class TokenDto {

	@ApiModelProperty(value = "token")
	private String token;

	@ApiModelProperty(value = "tokenHead字段名")
	private String tokenHead;

}

