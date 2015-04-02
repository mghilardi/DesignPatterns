package org.pattern.structural.filter.criteria;

import java.util.List;

import org.pattern.structural.filter.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}