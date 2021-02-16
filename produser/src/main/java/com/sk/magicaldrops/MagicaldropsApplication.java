package com.sk.magicaldrops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class MagicaldropsApplication {

	public static void main(String[] args) {

		SpringApplication.run(MagicaldropsApplication.class, args);
	}

}
