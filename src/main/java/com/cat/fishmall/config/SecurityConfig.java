package com.cat.fishmall.config;

import com.cat.fishmall.component.JwtAuthenticationTokenFilter;
import com.cat.fishmall.component.RestAuthenticationEntryPoint;
import com.cat.fishmall.component.RestfulAccessDeniedHandler;
import com.cat.fishmall.dto.AdminUserDetails;
import com.cat.fishmall.mbg.model.UmsAdmin;
import com.cat.fishmall.mbg.model.UmsPermission;
import com.cat.fishmall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/27
 * @Version: V1.0
 * @Description:
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启全局方法级别权限控制
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private RestfulAccessDeniedHandler restfulAccessDeniedHandler;
	@Autowired
	private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

	@Autowired
	private UmsAdminService adminService;

	//用于配置拦截的url ,jwt过滤器以及异常处理器
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable() // 禁用 csrf
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)//基于token ，关掉session
				.and()
				.authorizeRequests()//设置访问路径的权限
				.antMatchers(HttpMethod.GET,
						"/",
						"/*.html",
						"/favicon.ico",
						"/**/*.html",
						"/*.html",
						"/*.html",
						"/**/*.css",
						"/**/*.js",
						"/swagger-resources/**",
						"/v2/api-docs/**").permitAll()
				.antMatchers("/admin/login", "/admin/register").permitAll()//登录注册页面允许匿名访问
				.antMatchers(HttpMethod.OPTIONS).permitAll()//跨域请求会先进行一次 options 请求
				.anyRequest().authenticated();//其余请求都需要鉴权
		httpSecurity.headers().cacheControl();//禁用缓存
		httpSecurity.addFilterBefore(this.jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);//将自定义过滤器放在账号密码过滤器前面进行处理
		httpSecurity.exceptionHandling()
				.accessDeniedHandler(restfulAccessDeniedHandler)//鉴权不通过处理器
				.authenticationEntryPoint(restAuthenticationEntryPoint);//未登录结果返回

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService())
				.passwordEncoder(passwordEncoder());
	}

	@Bean
	public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
		return new JwtAuthenticationTokenFilter();
	}

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	//账号密码加密/解密bean
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		return username -> {
			UmsAdmin admin = adminService.getAdminByUsername(username);
			if (admin == null) {
				throw new UsernameNotFoundException("用户名或密码错误");
			}
			List<UmsPermission> permissionList = adminService.getPermissionList(admin.getId());
			return new AdminUserDetails(admin,permissionList);
		};
	}

}
