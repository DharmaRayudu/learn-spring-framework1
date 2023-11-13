package com.example.learnspringframework1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortRunnerForDifferent2 {
	
	@Autowired
	//@Qualifier("quickSort") This time it will use BubbleSort as it is Primary
	private SortAlgo algo;
	
	public SortRunnerForDifferent2(SortAlgo alog) {
		this.algo = alog;
	}

	public void run() {
		System.out.println(algo.getClass());
		algo.printAlgo();
	}
}
