package com.example.learnspringframework1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BGame implements GameConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("B Game UP");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("B Game down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("B Game left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("B Game right");

	}

}
