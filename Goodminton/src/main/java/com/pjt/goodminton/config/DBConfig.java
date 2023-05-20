package com.pjt.goodminton.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.pjt.goodminton.model.dao")
public class DBConfig {

}
