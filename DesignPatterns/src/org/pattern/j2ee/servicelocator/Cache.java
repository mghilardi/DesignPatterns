package org.pattern.j2ee.servicelocator;
import java.util.ArrayList;
import java.util.List;

import org.pattern.j2ee.servicelocator.service.Service;


public class Cache {

	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {

		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;

		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}