package com.bhalchandra.demo;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
//   	BeanFactory factory = new XmlBeanFactory(new FileSystemResource);
    	
    	Alien obj = (Alien)factory.getBean("alien");
    	//Above statement , creates a default constructor dependency with it!
    	// Otherwise , Alien alien = new Alien(age);
    	// as per our construction , this shows alien 
    	// can not define without age!
    	
    	System.out.println(obj.getAge());
    	
    	obj.code();
    }
}
