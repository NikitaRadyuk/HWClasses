package by.epam.tr.ex3;

import java.util.Scanner;

public class Customer {
	private int id;
	private String surname, name, patronymic;
	private String address;
	private int numOfCard;
	private int numOfBankAccount;

	public Customer(int id, String surname, String name, String patronymic, String address, int numOfCard,
			int numOfBankAccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.numOfCard = numOfCard;
		this.numOfBankAccount = numOfBankAccount;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

//
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

//			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//
	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

//			
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//
	public int getNumOfCard() {
		return numOfCard;
	}

	public void setNumOfCard(int numOfCard) {
		this.numOfCard = numOfCard;
	}

//
	public int getNumOfBankAccount() {
		return numOfBankAccount;
	}

	public void setNumOfBankAccount(int numOfBankAccount) {
		this.numOfBankAccount = numOfBankAccount;
	}

}
