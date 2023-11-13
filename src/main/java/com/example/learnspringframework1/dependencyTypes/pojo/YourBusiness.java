package com.example.learnspringframework1.dependencyTypes.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusiness {
	
	//@Autowired // using Field Injection
	private Dependency1 dependency1;
	
	//@Autowired // using Field Injection
	private Dependency2 dependency2;
	
	// Constructor Injection
	public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



	//@Autowired // Setter injection
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injecction dependency1");
		this.dependency1 = dependency1;
	}



	//@Autowired //Setter Injection
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("setter injection dependency2");
		this.dependency2 = dependency2;
	}



	public String toString() {
		return "Useing " + dependency1 +" And "+ dependency2;
	}
}
