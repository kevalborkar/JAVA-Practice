package com.practice.collections;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("kEval");
		a1.add("Aga Kasam");
		a1.add("FAIzan");
		a1.add("AkshAY");
		a1.add("APEksha");
		
		//Converting into Stream
		Stream<String> Stream1 = a1.stream();
		//Stream1.forEach(res -> System.out.println(res));
		
		/*//Filter Function
		Stream<String> Stream2 = Stream1.filter(res -> res.length() > 5);
		Stream2.forEach(res1 -> System.out.println(res1));*/
		
		//Map Function
		Stream<String> Stream2 = Stream1.map(res -> res.toLowerCase());
		Stream2.forEach(res1 -> System.out.println(res1));
	} 

}
