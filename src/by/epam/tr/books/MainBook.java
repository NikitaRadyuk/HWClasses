package by.epam.tr.books;

import by.epam.tr.airlines.Airline;
import by.epam.tr.books.Book;
import by.epam.tr.cust.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
	public static void main(String[] args) {

		Book[] books = new Book[] { new Book(107, "Peace&war", "Tolstoy", 1800, 500, 5, "skoba", "BRL"),
				new Book(203, "Star Wars", "Grey", 2017, 200, 3, "KBS", "BRL"),
				new Book(10, "It", "King", 2010, 300, 7, "KBS", "BNTU"),
				new Book(108, "Physics", "Skoybeda", 2000, 160, 1, "KBS", "BNTU") };
		print(books);
		listByAuthor(books);
		listByPublishing(books);
		listByYear(books);
	}

	public static String toString(Book b) {
		String str;
		str = "{" + b.getId() + "}{" + b.getName() + "}{" + b.getAuthor() + "}{" + b.getYear() + "}{"
				+ b.getNumOfPages() + "}{" + b.getCost() + "}{" + b.getType() + "}{"
				+ b.getPublishing().getPublishingPlace() + "}";
		return str;
	}

	public static void print(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			System.out.println(toString(books[i]));
		}
	}

	public static void listByAuthor(Book[] books) {
		ArrayList<String> listOfBooks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите јвтора: ");
		String n = sc.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().equals(n)) {
				listOfBooks.add(toString(books[i]));
			}
		}
		for (int i = 0; i < listOfBooks.size(); i++)
			System.out.println(listOfBooks.get(i));
	}

	public static void listByPublishing(Book[] books) {
		ArrayList<String> listOfBooks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите »здательство: ");
		String n = sc.nextLine();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublishing().getPublishingPlace().equals(n)) {
				listOfBooks.add(toString(books[i]));
			}
		}
		for (int i = 0; i < listOfBooks.size(); i++)
			System.out.println(listOfBooks.get(i));
	}

	public static void listByYear(Book[] books) {
		ArrayList<String> listOfBooks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите год: ");
		int n = sc.nextInt();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getYear() > n) {
				listOfBooks.add(toString(books[i]));
			}
		}
		for (int i = 0; i < listOfBooks.size(); i++)
			System.out.println(listOfBooks.get(i));
	}
}