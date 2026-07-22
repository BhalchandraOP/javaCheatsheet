package com.bhalchandra.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(FirstApplication.class, args);
		
		Alien obj = context.getBean(Alien.class) ;
		obj.code();
	}

}
