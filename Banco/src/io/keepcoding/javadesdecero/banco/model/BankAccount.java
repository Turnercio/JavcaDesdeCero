package io.keepcoding.javadesdecero.banco.model;

public class BankAccount {
	private String dni;
	private String name;
	private String surname;
	private int pass;
	private double balance;
	private boolean isLogged = false;
	
	public BankAccount(
			String dni,
			String name,
			String surname,
			int pass,
			double balance
			) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.pass = pass;
		this.balance = balance;
		this.isLogged = false;
	}
	
	public boolean authenticate(
			String dni,
			int pass
	) {
		this.isLogged = this.dni.equals(dni) &&
				this.pass == pass;
		return isLogged;
	}
	
	@Override
	
	public String toString() {
		return String.format(
				"DNI: %s, Name: %s, Surname: &s, Balance: %s",
				dni, name, surname, Double.toString(balance));
		
	}
	
	public boolean getCash(int quantity) {
		boolean hasSucces = false;
		if (isLogged && (balance - quantity >=0)) {
			hasSucces = true;
			balance -= quantity;
		}
		return hasSucces;
	}
	
	public boolean income (int quantity) {
		boolean hasSucces = false;
		if (isLogged) {
			hasSucces = true;
			balance += quantity;
		}
		return hasSucces;
	}
	
	// Getters y setters
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getPass() {
		return pass;
	}
	
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public boolean isLogged() {
		return isLogged;
	}
	
	/* opción sin devolver el estado
	public void authenticate(
			String dni,
			int pass
	) {
		this.isLogged = this.dni == dni &&
				this.pass == pass;
	}*/
	
}
