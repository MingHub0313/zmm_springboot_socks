package com.hehe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * User 启动类
 * @Name MybatisApplication
 * @Author zmm
 * @Created by 2019/3/8 0008
 */
@SpringBootApplication
@MapperScan("com.hehe.mapper")
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
}
