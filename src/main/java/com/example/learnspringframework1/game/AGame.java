package com.example.learnspringframework1.game;

import org.springframework.stereotype.Component;

@Component
public class AGame implements GameConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("AGame UP");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("AGame down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("AGame left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub

		System.out.println("AGame right");
	}

}
