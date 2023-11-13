package com.example.learnspringframework1.dependencyTypes;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.learnspringframework1.dependencyTypes.pojo.YourBusiness;

@Configuration
@ComponentScan
public class DependencyInjectionTypes {

	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionTypes.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("........................");
			
			var object = context.getBean(YourBusiness.class);
			
			System.out.println(object);
		}

	}

}
