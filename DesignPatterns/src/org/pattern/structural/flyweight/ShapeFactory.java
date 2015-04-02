package org.pattern.structural.flyweight;
import java.util.HashMap;
import java.util.Map;

import org.pattern.structural.flyweight.shape.Circle;
import org.pattern.structural.flyweight.shape.Shape;


public class ShapeFactory {
	private static final Map<String, Shape> circleMap = new HashMap<String, Shape>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println(">>Creating circle of color : " + color);
		}
		return circle;
	}
}