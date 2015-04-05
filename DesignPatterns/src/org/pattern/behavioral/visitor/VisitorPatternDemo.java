package org.pattern.behavioral.visitor;

import org.pattern.behavioral.visitor.computer.Computer;
import org.pattern.behavioral.visitor.computer.ComputerPart;

public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}