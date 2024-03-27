package com.cat.fishmall.component;

import cn.hutool.json.JSONUtil;
import com.cat.fishmall.common.api.CommonResult;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 当未登录或者token失效访问接口时，自定义的返回结果
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
	@Override
	public void commence(HttpServletRequest httpServletRequest, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.getWriter().println(JSONUtil.parse(CommonResult.unauthorized(e.getMessage())));
		response.getWriter().flush();
	}
}
