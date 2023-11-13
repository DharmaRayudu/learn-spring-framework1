package com.example.learnspringframework1.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class ScopeAppTest {
	
	@Component
	class Normal{
		
	}
	
	@Component
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	class ScopeTest{
		
	}

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(ScopeAppTest.class)){
			
			System.out.println(context.getBean(Normal.class));// If Scope is singleton it will be having only one Object and it will return same object
			                                                 //For every get Bean it will return same object
			System.out.println(context.getBean(Normal.class));
			
			System.out.println(context.getBean(ScopeTest.class)); // For Every getBean this will create a new object
			System.out.println(context.getBean(ScopeTest.class));
			System.out.println(context.getBean(ScopeTest.class));
			
		}

	}

}
