package org.robotframework.multiples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MultiplesGetter {
	
	@Autowired
	private NumberService service;
	
	public List<Integer> getMultiplesSmallerThan(int number, int goal) {
		return this.service.getMultiplesSmallerThan(number, goal);
	}
}
