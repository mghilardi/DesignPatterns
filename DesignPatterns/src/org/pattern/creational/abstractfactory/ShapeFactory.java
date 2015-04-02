package org.pattern.creational.abstractfactory;

import org.pattern.creational.abstractfactory.color.Color;
import org.pattern.creational.abstractfactory.shape.Circle;
import org.pattern.creational.abstractfactory.shape.Rectangle;
import org.pattern.creational.abstractfactory.shape.Shape;
import org.pattern.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}