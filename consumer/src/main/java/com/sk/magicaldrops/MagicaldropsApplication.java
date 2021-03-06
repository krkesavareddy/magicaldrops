package com.sk.magicaldrops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
public class MagicaldropsApplication {

	public static void main(String[] args) {
		System.out.println("ready to drink magical water");
		SpringApplication.run(MagicaldropsApplication.class, args);
	}

}
