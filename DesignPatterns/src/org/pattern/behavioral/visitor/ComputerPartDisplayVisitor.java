package org.pattern.behavioral.visitor;

import org.pattern.behavioral.visitor.computer.Computer;
import org.pattern.behavioral.visitor.computer.Keyboard;
import org.pattern.behavioral.visitor.computer.Monitor;
import org.pattern.behavioral.visitor.computer.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}
}