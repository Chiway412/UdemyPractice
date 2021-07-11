package com.udemy.spring.looseCouplingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		ApplicationContext appContext= SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class,args);
		
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
	
		System.out.println(result);
		
	}

}
