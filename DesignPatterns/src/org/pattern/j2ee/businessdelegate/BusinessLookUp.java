package org.pattern.j2ee.businessdelegate;

import org.pattern.j2ee.businessdelegate.service.BusinessService;
import org.pattern.j2ee.businessdelegate.service.EJBService;
import org.pattern.j2ee.businessdelegate.service.JMSService;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {

		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}