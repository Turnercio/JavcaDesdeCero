package io.keepcoding.javadesdecero.libreria.model;


/**
 * public --> publico
 * private -> Privado
 * Las propiedades son privadas
 * Plain 
 * Old 
 * Java
 * Object
 */

public class Person {

	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >=0) {
			this.age = age;
		}	
	}
	
	public String getAddress() {
		return address;
		
	}
	
	public void setAddress ( String address) {
		this.address = address;
	}


	public String showInfo() {
		String result = "Nombre; " + name + " edad: " + age + " Direccion; "+ address;
		return result;
	}
}