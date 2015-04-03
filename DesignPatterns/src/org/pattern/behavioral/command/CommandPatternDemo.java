package org.pattern.behavioral.command;

import org.pattern.behavioral.command.stock.BuyStock;
import org.pattern.behavioral.command.stock.SellStock;
import org.pattern.behavioral.command.stock.Stock;

public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}