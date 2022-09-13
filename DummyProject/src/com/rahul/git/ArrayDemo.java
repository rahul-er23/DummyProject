package com.rahul.git;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rahul","Amol","Shital","Satyam");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
