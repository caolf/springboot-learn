package com.clf.springboot.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * myabit 使用xml+接口类的方式
 * mappersan 扫描包下面所有的接口
 */
@SpringBootApplication
@MapperScan("com.clf.springboot.learn.dao")
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}
}
