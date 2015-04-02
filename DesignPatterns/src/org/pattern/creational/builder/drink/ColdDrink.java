package org.pattern.creational.builder.drink;

import org.pattern.creational.builder.Item;
import org.pattern.creational.builder.pack.Bottle;
import org.pattern.creational.builder.pack.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}