package com.lincoln.lyjuc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author lincoln
 */
@EnableAsync
@SpringBootApplication
public class JucApplication {

	public static void main(String[] args) {
		SpringApplication.run(JucApplication.class, args);
	}

}
