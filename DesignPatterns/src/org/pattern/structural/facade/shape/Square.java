package org.pattern.structural.facade.shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}