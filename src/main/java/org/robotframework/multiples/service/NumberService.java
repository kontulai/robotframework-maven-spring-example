package org.robotframework.multiples.service;

import java.util.List;

public interface NumberService {
	
	public boolean isSmallerThan(int x, int y);
	
	public List<Integer> getMultiplesSmallerThan(int number, int goal);

}
