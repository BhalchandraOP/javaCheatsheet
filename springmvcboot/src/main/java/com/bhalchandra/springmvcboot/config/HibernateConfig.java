package com.bhalchandra.springmvcboot.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds =
                new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

        ds.setUrl("jdbc:mysql://localhost:3306/aliendb");

        ds.setUsername("root");

        ds.setPassword("RaNa@#1312$%");

        return ds;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory() {

        LocalSessionFactoryBean factory =
                new LocalSessionFactoryBean();

        factory.setDataSource(dataSource());
        
		//How does Hibernate discover Entity?
		//Hibernate enters that package
		        factory.setPackagesToScan(
                "com.bhalchandra.springmvcboot.model"
        );

        Properties props = new Properties();

//        props.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");

        props.put("hibernate.show_sql", true);

        props.put("hibernate.format_sql", true);

        props.put("hibernate.hbm2ddl.auto", "update");

        factory.setHibernateProperties(props);

        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager(
            SessionFactory sessionFactory) {

        return new HibernateTransactionManager(sessionFactory);
    }
}