package com.example.learnspringframework1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GameConsole console;
	
	public GameRunner(@Qualifier("cGame") GameConsole console) {
		this.console = console;
	}

	public void run() {
		console.up();
		console.down();
		console.right();
		console.left();
	}
}
