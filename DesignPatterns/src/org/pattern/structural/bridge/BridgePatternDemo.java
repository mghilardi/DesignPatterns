package org.pattern.structural.bridge;

import org.pattern.structural.bridge.draw.GreenCircle;
import org.pattern.structural.bridge.draw.RedCircle;
import org.pattern.structural.bridge.shape.Circle;
import org.pattern.structural.bridge.shape.Shape;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}