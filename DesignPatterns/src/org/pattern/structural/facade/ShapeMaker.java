package org.pattern.structural.facade;

import org.pattern.structural.facade.shape.Circle;
import org.pattern.structural.facade.shape.Rectangle;
import org.pattern.structural.facade.shape.Shape;
import org.pattern.structural.facade.shape.Square;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}