package org.robotframework;

import java.util.List;

import org.robotframework.multiples.service.Application;
import org.robotframework.multiples.service.MultiplesGetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultiplesLibrary {

	private ApplicationContext context;
	private MultiplesGetter service;
	
	public MultiplesLibrary() {
		this.context = new AnnotationConfigApplicationContext(Application.class);
		this.service = this.context.getBean(MultiplesGetter.class);
	}
	
	public List<Integer> getMultiplesBelow(int number, int goal) {
		return this.service.getMultiplesSmallerThan(number, goal);
	}
	

}
