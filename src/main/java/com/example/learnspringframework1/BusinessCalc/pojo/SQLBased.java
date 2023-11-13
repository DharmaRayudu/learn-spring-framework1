package com.example.learnspringframework1.BusinessCalc.pojo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // While starting the application it will not be instantiated, when we call getBean 
//that time this bean will be initialized.
public class SQLBased implements DataService {
	
	public SQLBased() {
		// TODO Auto-generated constructor stub
		System.out.println("SQLBased Initialization stared");
	}
	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[]{1,2,3,4,5,6};
	}

}
