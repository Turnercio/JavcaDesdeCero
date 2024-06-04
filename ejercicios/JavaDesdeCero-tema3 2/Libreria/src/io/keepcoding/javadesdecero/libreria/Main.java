package io.keepcoding.javadesdecero.libreria;

import io.keepcoding.javadesdecero.libreria.model.Person;

/**
 * Pruebas, instanciar los modelos y inicializar
 * */
public class Main {
	
	public static void main(String [] args) {
		Person p = new Person();
		
		// si la propiedad fuera publica
		p.samplePublic = null;
		// Sample error accessing private property
		// p.age = 20;
		p.setAge(20);
		p.setName("Pablo");
		p.setAddress("Address");
		
		System.out.println(p.showInfo());
	}
}
