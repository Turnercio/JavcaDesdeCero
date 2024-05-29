package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestArrayIteration {
	
	public static void main(String [] args) {
		
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Uno");
		stringList.add("Dos");
		stringList.add("Tres");
		stringList.add("Cuatro");
		stringList.add("Cinco");
		stringList.add("Seis");
		stringList.add("Siete");
		
		for (String element : stringList) {
			System.out.println(element);
		}
	}

}