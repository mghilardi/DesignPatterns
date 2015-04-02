package org.pattern.creational.builder;

import org.pattern.creational.builder.drink.Coke;
import org.pattern.creational.builder.drink.Pepsi;
import org.pattern.creational.builder.food.ChickenBurger;
import org.pattern.creational.builder.food.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}