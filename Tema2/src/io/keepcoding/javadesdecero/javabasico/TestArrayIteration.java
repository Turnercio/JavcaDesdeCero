package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestArrayIteration {
	
	public static void main(String [] args) {
		
		testArrayList();
		testWhile();	
		testDoWhile();
		}
	
	
	public static void testWhile() {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		//i = 0;
		//while ( i< list.size())
	}
	
	public static void testDoWhile() {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);		
		
		int i = 0;
		if (list.size()>0) {
			do {
			System.out.println(list.get(i));
			i++;
		} while ( i < list.size());
			
		}
		
	}
	
	
	public static void testArrayList() {
	
	ArrayList<String> stringList = new ArrayList<>();
	
		stringList.add("Uno");
		stringList.add("Dos");
		stringList.add("Tres");
		stringList.add("Cuatro");
		stringList.add("Cinco");
		stringList.add("Seis");
		stringList.add("Siete");
		
		for (int i = 0; i<stringList.size(); i++) {
			System.out.println(stringList.get(i));
		
		//for (String element : stringList) {
			//System.out.println(element);
		}
	}
}
