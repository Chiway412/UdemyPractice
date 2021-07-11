package com.udemy.spring.looseCouplingJava;

public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		// In the context of spring, we should know:
		// (1) what are the beans (@Component): new BubbleSortAlgorithm()
		// (2) what are the dependencies of a bean (@Autowired):<private SortAlgorithm sortAlgorithm> in BinarySearchImpl
		// (3) where to search for beans (@SpringBootApplication to scan the @component in the package)?
		
		BinarySearchImpl binarySearch =  new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
	
		System.out.println(result);
		
	}

}
