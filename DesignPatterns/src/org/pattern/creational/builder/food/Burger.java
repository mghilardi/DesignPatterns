package org.pattern.creational.builder.food;

import org.pattern.creational.builder.Item;
import org.pattern.creational.builder.pack.Packing;
import org.pattern.creational.builder.pack.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}