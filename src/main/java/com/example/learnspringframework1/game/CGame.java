package com.example.learnspringframework1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cGame")
public class CGame implements GameConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("CGame up");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("CGame down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("CGame left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("CGame right");

	}

}
