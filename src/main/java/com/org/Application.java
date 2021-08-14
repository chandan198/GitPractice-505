package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.service.HelloJava;

@SpringBootApplication
public class Application {

Integer rollno =101;
String name =”Dilip Changes”;


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		HelloJava helloJava = context.getBean(HelloJava.class);
		
	}

}
