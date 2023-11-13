package com.example.learnspringframework1.BusinessCalc;

import java.util.Arrays;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.learnspringframework1.BusinessCalc.pojo.DataService;

@Component
@Lazy
public class BusinessCalculation {
	
	private DataService dataService;

	public BusinessCalculation(DataService dataService) {
		super();
		System.out.println("Initialization started");
		this.dataService = dataService;
	}
	
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
