package com.bhalchandra.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import com.bhalchandra.SpringJDBC.model.Alien;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
			ApplicationContext context= SpringApplication.run(SpringJdbcDemoApplication.class, args);
			
			Alien alien1 = context.getBean(Alien.class);
			
			alien1.setId(13);
			alien1.setName("Bhalchandra");
			alien1.setTech("JAVA");
			
			AlienDAO repo = context.getBean(AlienDAO.class);
		//	repo.save(alien1);
			System.out.println(repo.findAll());
	}

	
}
