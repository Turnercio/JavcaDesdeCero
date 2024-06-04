package io.keepcoding.javadesdecero.bank.model;

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
		this.isLogged = this.dni == dni &&
				this.pass == pass;
		return isLogged;
	}
	
	
	public void getCash(int quantity) {
		if (isLogged) {
			balance -= quantity;
		}
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
