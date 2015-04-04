package org.pattern.behavioral.nullobject;

import org.pattern.behavioral.nullobject.customer.AbstractCustomer;
import org.pattern.behavioral.nullobject.customer.NullCustomer;
import org.pattern.behavioral.nullobject.customer.RealCustomer;

public class CustomerFactory {

	public static final String[] names = { "Rob", "Joe", "Julie" };

	public static AbstractCustomer getCustomer(String name) {

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}