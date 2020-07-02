package com.grupo21.ifome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupo21"})
public class IfomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfomeApplication.class, args);
	}

}
