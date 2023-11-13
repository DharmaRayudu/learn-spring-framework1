package com.example.learnspringframework1.BusinessCalc.pojo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class MySQLBased implements DataService {
	
	public MySQLBased() {
		System.out.println("MySQLBased initialization stareted");
	}

	@Override
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55,66,77};
	}

}
