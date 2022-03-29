package by.epam.tr.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import by.epam.tr.ex2.Airline;

public class MainAir {
	public static void main(String[] args) {

		Airline[] airlines = new Airline[] { new Airline(11.00, "Minsk", "boeing", 111, "mon"),
				new Airline(12.00, "Warsaw", "businessjet", 777, "tue"),
				new Airline(1.00, "Minsk", "helicopter", 826, "mon"), new Airline(21.00, "Minsk", "boeing", 234, "fri"),

		};
		print(airlines);
		System.out.println("------------------------------");
		listByDestination(airlines);
		listByDayOfWeek(airlines);
		listByDayWithTime(airlines);
	}

	public static String toString(Airline air) {
		String str;
		str = "{" + air.getTime() + " }{" + air.getDestination() + "}{ " + air.getType() + " }{" + air.getNumOfFlight()
				+ "}{" + air.getDayOfWeek() + "}";
		return str;
	}

	public static void print(Airline[] airlines) {
		for (int i = 0; i < airlines.length; i++) {
			System.out.println(toString(airlines[i]));
		}
	}

	public static void listByDestination(Airline[] airlines) {

		ArrayList<String> listOfAirlines = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите пункт назначени€: ");
		String n = sc.nextLine();
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDestination().equals(n)) {
				listOfAirlines.add(toString(airlines[i]));
			}

		}
		for (int i = 0; i < listOfAirlines.size(); i++)
			System.out.println(listOfAirlines.get(i));
	}

	public static void listByDayOfWeek(Airline[] airlines) {

		ArrayList<String> listOfAirlines = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите день недели: ");
		String n = sc.nextLine();
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDayOfWeek().equals(n)) {
				listOfAirlines.add(toString(airlines[i]));
			}

		}
		for (int i = 0; i < listOfAirlines.size(); i++)
			System.out.println(listOfAirlines.get(i));
	}

	public static void listByDayWithTime(Airline[] airlines) {

		ArrayList<String> listOfAirlines = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите день недели: ");
		String n = sc.nextLine();
		System.out.println("¬ведите врем€: ");
		double t = sc.nextDouble();
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDayOfWeek().equals(n) && airlines[i].getTime() > t) {
				listOfAirlines.add(toString(airlines[i]));
			}

		}
		for (int i = 0; i < listOfAirlines.size(); i++)
			System.out.println(listOfAirlines.get(i));
	}
}
