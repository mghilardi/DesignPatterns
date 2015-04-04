package org.pattern.behavioral.strategy;

import org.pattern.behavioral.strategy.operation.Add;
import org.pattern.behavioral.strategy.operation.Multiply;
import org.pattern.behavioral.strategy.operation.Substract;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new Add());
		System.out.println("10 + 5 = " + context.executeOperation(10, 5));

		context = new Context(new Substract());
		System.out.println("10 - 5 = " + context.executeOperation(10, 5));

		context = new Context(new Multiply());
		System.out.println("10 * 5 = " + context.executeOperation(10, 5));
	}
}