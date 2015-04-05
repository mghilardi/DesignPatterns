package org.pattern.behavioral.template;

import org.pattern.behavioral.template.game.Cricket;
import org.pattern.behavioral.template.game.Football;
import org.pattern.behavioral.template.game.Game;

public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}