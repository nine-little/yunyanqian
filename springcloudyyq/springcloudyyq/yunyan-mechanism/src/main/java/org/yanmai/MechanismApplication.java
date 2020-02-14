package org.yanmai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("org.yanmai.dao")
@SpringBootApplication
@EnableEurekaClient
public class MechanismApplication {

	public static void main(String[] args) {
		SpringApplication.run(MechanismApplication.class, args);
	}
}
