package com.grupo21.interfaces.WebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupo21"})
public class IFomeWS {
	public static void main(String[] args) {
		SpringApplication.run(IFomeWS.class, args);
	}

}
