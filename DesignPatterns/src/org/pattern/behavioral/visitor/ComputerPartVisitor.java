package org.pattern.behavioral.visitor;

import org.pattern.behavioral.visitor.computer.Computer;
import org.pattern.behavioral.visitor.computer.Keyboard;
import org.pattern.behavioral.visitor.computer.Monitor;
import org.pattern.behavioral.visitor.computer.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}