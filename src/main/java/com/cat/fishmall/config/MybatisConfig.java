package com.cat.fishmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/22
 * @Version: V1.0
 * @Description:
 **/
@Configuration
@MapperScan("com.cat.fishmall.mbg.mapper")
public class MybatisConfig {

}
