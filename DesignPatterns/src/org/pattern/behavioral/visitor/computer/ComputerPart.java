package org.pattern.behavioral.visitor.computer;

import org.pattern.behavioral.visitor.ComputerPartVisitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}