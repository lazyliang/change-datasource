package com.ll.testdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 使用了spring-boot会自Autoconfiguration，
 * 所以我们需要在启动类注解上作如下修改，不让spring-boot给我们自动配置
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ChangeDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangeDatasourceApplication.class, args);
	}
}
