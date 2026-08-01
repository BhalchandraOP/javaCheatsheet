package com.bhalchandra.studentregistrationmvc.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class HibernateConfig {

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
	       ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

	        ds.setUrl("jdbc:mysql://localhost:3306/aliendb");

	        ds.setUsername("root");

	        ds.setPassword("RaNa@#1312$%");

	        return ds;
		
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		
		factory.setDataSource(datasource());
		
		factory.setPackagesToScan("com.bhalchandra.studentregistrationmvc.model");
		
		Properties props = new Properties();
		
		props.put("hibernate.dialect",
                "org.hibernate.dialect.MySQLDialect");

        props.put("hibernate.show_sql", true);

        props.put("hibernate.format_sql", true);

        props.put("hibernate.hbm2ddl.auto", "update");
        
        	factory.setHibernateProperties(props);
        	
		return factory;
	}
	
	@Bean
	public PlatformTransactionManager transactionmangaer(SessionFactory session) {
			
		return new HibernateTransactionManager(session);
	}
	
}
