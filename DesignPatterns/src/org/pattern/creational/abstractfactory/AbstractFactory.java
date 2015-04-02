package org.pattern.creational.abstractfactory;

import org.pattern.creational.abstractfactory.color.Color;
import org.pattern.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}