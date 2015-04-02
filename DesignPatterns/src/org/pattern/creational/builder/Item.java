package org.pattern.creational.builder;

import org.pattern.creational.builder.pack.Packing;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}