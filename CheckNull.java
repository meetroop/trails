package com.qualys.samsample.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CheckNull {

	public static void main(String[] args) {
	
		System.out.println(ch());

	}
	
	
	
	public static String ch() {

		Set<String> dependencies = new HashSet<>(); 
		
		dependencies.add(null);
		dependencies.add(null);
		

		int count = (int) dependencies.stream().filter(p->p!=null).count();
		
		return count != 1?null:dependencies.stream().filter(p->p!=null).findFirst().get();
		
	}


}
