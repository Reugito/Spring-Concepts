package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Spring Concept");
		//SpringApplication.run(SpringConceptsApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println("DemoBean = "+ demoBean.toString());
	}

}
