package com.zp.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZP
 * @date 2021/3/28.
 * mybatis配置类
 */
@Configuration
@MapperScan({"com.zp.mall.tiny.mbg.mapper", "com.zp.mall.tiny.dao"})
public class MyBatisConfig {
}