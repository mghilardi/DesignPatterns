package org.pattern.frontcontroller;

import org.pattern.frontcontroller.view.HomeView;
import org.pattern.frontcontroller.view.StudentView;

public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}