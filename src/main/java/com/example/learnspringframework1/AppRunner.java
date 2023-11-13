package com.example.learnspringframework1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.learnspringframework1.game.AGame;
import com.example.learnspringframework1.game.GameConsole;
import com.example.learnspringframework1.game.GameRunner;
import com.example.learnspringframework1.game.SortRunner;
import com.example.learnspringframework1.game.SortRunnerForDifferent;
import com.example.learnspringframework1.game.SortRunnerForDifferent2;

@Configuration
@ComponentScan("com.example.learnspringframework1.game")
public class AppRunner {

	public static void main(String[] args) {
		
		try(var context = new  AnnotationConfigApplicationContext(AppRunner.class)){
			
			//var ob =  context.getBean(GameRunner.class);
			//ob.run();
			var bo =  context.getBean(SortRunner.class);
			bo.run();
			
			var bo1 =  context.getBean(SortRunnerForDifferent.class);
			bo1.run();
			
			var bo11 =  context.getBean(SortRunnerForDifferent2.class);
			bo11.run();
			
		
		
		}

	}

}
