package io.keepcoding.javadesdecero.javabasico;

public class TestString {

	public static void main(String[] args) {
		String str = "My awesome String";
		
		System.out.println("Lenght: "+ str.length());
		System.out.println("Contains: " + str.contains("aw"));
		System.out.println("Substring sólo begin: " + str.substring(11));
		System.out.println("Substring begin y end: " + str.substring(11, 13));
		System.out.println("Substring begin y end: " + str.charAt(str.length()-1));
		System.out.println("Substring begin y end: " + str.charAt(0));
		

	}

}
