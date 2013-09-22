package org.robotframework.multiples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application{

	@Bean
	NumberService implementNumberService() {
		return new NumberService() {
			
			public boolean isSmallerThan(int x, int y) {
				return x < y;
			}
			
			public List<Integer> getMultiplesSmallerThan(int number, int goal) {
				List<Integer> result = new ArrayList<Integer>();
				for (int i = 1; i < goal; i++) {
					int multiple = i * number;
					if (isSmallerThan(multiple, goal)) {
						result.add(multiple);
					} else {
						break;
					}
				}
				return result;
			}
		};
	}
}
