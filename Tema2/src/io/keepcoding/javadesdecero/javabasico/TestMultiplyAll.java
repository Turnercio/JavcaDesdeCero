package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;


public class TestMultiplyAll {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);	
		lista.add(10);
		lista.add(7);
		lista.add(25);
		lista.add(5);
		
		System.out.println(SelectMultCinco(lista));
		
        ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        list.add(" ");
        list.add("Mundo");

        System.out.println(concatAll(list));
        
        ArrayList<Integer> lista2 = new ArrayList<>();
		lista2.add(1);
		lista2.add(2);	
		lista2.add(10);
		lista2.add(7);
		lista2.add(25);
		lista2.add(5);
		System.out.println(toFloat(lista2));
		
		
		
		System.out.println(toPSentence(list));
		
		
		
	}
	
		
	public static String concatAll(ArrayList<String> list) {
		String result = "";
		
		for (int i = 0;i<list.size();i++) {
			result = result + list.get(i);
		}
		return result;

		
	}
		
	public static ArrayList<Integer> SelectMultCinco(ArrayList<Integer> lista) {
		ArrayList<Integer> listaResultado = new ArrayList<>();
		int i = 0;
		for (i=0;i<lista.size();i++) {
			if(lista.get(i)%5 == 0) {
				listaResultado.add(lista.get(i));
			}
		}
		return listaResultado;
	}
	
	public static ArrayList<Float> toFloat(ArrayList<Integer> lista){
		ArrayList<Float> listaResultado = new ArrayList<>();
		
		for(Integer elemento:lista) {
			listaResultado.add(Float.valueOf(elemento));
			
		}
		return listaResultado;
		
	}
	
	public static ArrayList<String> toPSentence(ArrayList<String> lista) {
		ArrayList<String> listaResultado = new ArrayList<>();
		
		for (int elemento:lista) {
			listaResultado.add(transformString(elemento));
		}
		
			
	}
	public static String transformString(String element) {
		
		ArrayList<Char> vocales = new ArrayList<>();
		
		vocales.add('a');
		vocales.add('e');
		vocales.add('i');
		vocales.add('o');
		vocales.add('u');
		
		
		for (int char:element) {
			if 
		}
		
		}
}