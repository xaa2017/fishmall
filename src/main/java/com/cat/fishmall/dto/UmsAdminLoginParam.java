package com.cat.fishmall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@Data
public class UmsAdminLoginParam {
	@ApiModelProperty(value = "用户名", required = true)
	@NotEmpty(message = "用户名不能为空")
	private String username;

	@ApiModelProperty(value = "密码", required = true)
	@NotEmpty(message = "密码不能为空")
	private String password;
}
