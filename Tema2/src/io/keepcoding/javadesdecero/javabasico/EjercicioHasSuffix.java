package io.keepcoding.javadesdecero.javabasico;

public class EjercicioHasSuffix {

	public static void main(String[] args) {
		
		String cadena1 = "Hola Mundo";
		String cadena2 = "Hol";
		System.out.println( hasPrefix(cadena1, cadena2));
		System.out.println( hasSuffix(cadena1, cadena2));		
	}
	public static boolean hasPrefix (String cadena1, String cadena2) {
			
		return cadena1.startsWith(cadena2);
			 
	}
	public static boolean hasSuffix (String cadena1, String cadena2) {
		
		return cadena1.endsWith(cadena2);
			 
	}
			
	
}
