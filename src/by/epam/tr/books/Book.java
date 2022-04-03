package by.epam.tr.books;

import java.util.Scanner;

import by.epam.tr.cust.BankInfo;

public class Book {
	private String name;
	private String author;
	private int year;
	private int numOfPages;
	private int cost;
	private int id;
	private Publishing publishing;
	private String type;

	public Book(int id, String name, String author, int year, int numOfPages, int cost, String type,
			String publishingPlace) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.numOfPages = numOfPages;
		this.cost = cost;
		this.id = id;
		this.type = type;
		publishing = new Publishing(publishingPlace);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//
	public int getId() {
		return id;
	}

	public void SetDestination(int id) {
		this.id = id;
	}

//				
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//
	public Publishing getPublishing() {
		return publishing;
	}

	public void setPublishing(Publishing publishing) {
		this.publishing = publishing;
	}

//
	public int getYear() {
		return year;
	}

	public void setName(int year) {
		this.year = year;
	}

//
	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

//
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}