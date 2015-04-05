package org.pattern.j2ee.servicelocator.service;

public class Service2 implements Service {
	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

	@Override
	public String getName() {
		return "Service2";
	}
}