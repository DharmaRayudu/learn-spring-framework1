package com.example.learnspringframework1.postConstructPred;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named // these are from Jakarta EE
class PostTest{
	
	private SomeTest someTest;

//	public PostTest(SomeTest someTest) {
//		super();
//		this.someTest = someTest;
//		System.out.println("Initalization done");
//	}
	
	@Inject
	public void setSomeTest(SomeTest someTest) {
		this.someTest = someTest;
	}
	
	@PostConstruct
	public void initalize() {
		someTest.somePrint();
	}

	@PreDestroy
	public void codeClean() {
		System.out.println("Do code cleanup activity");
	}
	
	public void test() {
		System.out.println("Test is called");
	}
}

//@Component
@Named
class SomeTest{

	public void somePrint() {
		// TODO Auto-generated method stub
		System.out.println("Some Code initialization");
		
	}
	
}

@Configuration
@ComponentScan
public class PostConstuctPreDestoryTest {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(PostConstuctPreDestoryTest.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			var tx=context.getBean(PostTest.class);
			tx.test();
			
			
		}

	}

}
