package com.imanage.stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.imanage.stack"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class StackApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackApplication.class, args);
	}

}
