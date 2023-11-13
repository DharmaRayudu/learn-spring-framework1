package com.example.learnspringframework1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortRunnerForDifferent {
	
	@Autowired
	private SortAlgo algo;
	
	public SortRunnerForDifferent(SortAlgo alog) {
		this.algo = alog;
	}

	public void run() {
		System.out.println(algo.getClass());
		algo.printAlgo();
	}
}
