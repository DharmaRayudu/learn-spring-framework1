package com.example.learnspringframework1.BusinessCalc;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan
public class DataServiceApp {

	public static void main(String[] args) {
		
		try(var context= new AnnotationConfigApplicationContext(DataServiceApp.class)){
			
			System.out.println("Application Started..");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("After Application Started..");
			var object=  context.getBean(BusinessCalculation.class);
			
			System.out.println(object.findMax());
		}

	}

}
