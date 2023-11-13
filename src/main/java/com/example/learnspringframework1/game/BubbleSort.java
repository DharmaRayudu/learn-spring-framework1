package com.example.learnspringframework1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgo {

	@Override
	public void printAlgo() {
		System.out.println("BubbleSort");

	}

}
