package io.keepcoding.javadesdecero.libreria;

import java.util.Scanner;

import io.keepcoding.javadesdecero.libreria.model.Book;
import io.keepcoding.javadesdecero.libreria.model.Library;


/**
 * Pruebas, instanciar los modelos y inicializar
 * */
public class MainLibrary {
	
	public static void main(String [] args) {
		//testPerson()
		Library library = new Library();
		Book testBook = new Book(
				"1",
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari"
				);
		library.addBook(new Book(
				"1",
				"Sapiens: A Brief History of Humankind",
				"Yuval Noah Harari",
				10
				));
		library.addBook(new Book(
				"2",
				"One Hundred Years of Solitude",
				"Gabriel García Márquez",
				12
				));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el isbn para buscar");
		String isbnInput = input.nextLine();
		
		System.out.println(library.findByIsbn(isbnInput));
		
	}
	
	public static void testPerson() {
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
