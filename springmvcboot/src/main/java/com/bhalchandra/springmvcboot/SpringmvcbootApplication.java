package com.bhalchandra.springmvcboot;

import javax.sql.DataSource;

import org.apache.naming.ContextAccessController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ContextIdApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringmvcbootApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context =
	                SpringApplication.run(SpringmvcbootApplication.class, args);
		  DataSource ds = context.getBean(DataSource.class);
//		System.out.println(ds);
	}

}
