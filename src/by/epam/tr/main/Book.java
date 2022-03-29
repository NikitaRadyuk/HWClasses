package by.epam.tr.main;

import java.util.Scanner;

public class Book {
	private String name;
	private String author;
	private int year, numOfPages, cost, id;
	private String publishing, type;

	public Book(int id, String name, String author, int year, int numOfPages, int cost, String publishing,
			String type) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.numOfPages = numOfPages;
		this.cost = cost;
		this.publishing = publishing;
		this.id = id;
		this.type = type;
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
	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
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