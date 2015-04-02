package org.pattern.creational.abstractfactory;

import org.pattern.creational.abstractfactory.color.Blue;
import org.pattern.creational.abstractfactory.color.Color;
import org.pattern.creational.abstractfactory.color.Green;
import org.pattern.creational.abstractfactory.color.Red;
import org.pattern.creational.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}