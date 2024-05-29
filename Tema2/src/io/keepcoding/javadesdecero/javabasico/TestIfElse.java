package io.keepcoding.javadesdecero.javabasico;

public class TestIfElse {

	public static void main(String[] args) {
		
		//declaracion de variables
		
		float nota = 8f;
		
		//boolean isApproved = nota >= 7;
		
		System.out.println("Result: " + PassesTest(nota));
		
	}
	
	public static boolean PassesTest(float note) {
		
		return note >= 7;
		
	}
}
