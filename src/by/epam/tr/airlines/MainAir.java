package by.epam.tr.airlines;

import java.util.ArrayList;
import java.util.Scanner;
import by.epam.tr.airlines.Airline;

public class MainAir {
	public static void main(String[] args) {

		Airline[] airlines = new Airline[] { new Airline("Minsk", "boeing", 111, 11.00, "mon"),
				new Airline("Warsaw", "businessjet", 777, 12.00, "tue"),
				new Airline("Minsk", "helicopter", 826, 21.00, "mon"),
				new Airline("Minsk", "boeing", 234, 1.00, "fri"), };
		print(airlines);
		System.out.println("------------------------------");
		listByDestination(airlines);
		listByDayOfWeek(airlines);
		listByDayWithTime(airlines);
	}

	public static String toString(Airline air) {
		String str;
		str = "{" + air.getDestination() + "}{ " + air.getType() + " }{" + air.getNumOfFlight() + "}{"
				+ air.getDayWithTime().getTime() + " }{" + air.getDayWithTime().getDayOfWeek() + "}";
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
			if (airlines[i].getDayWithTime().getDayOfWeek().equals(n)) {
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
			if (airlines[i].getDayWithTime().getDayOfWeek().equals(n) && airlines[i].getDayWithTime().getTime() > t) {
				listOfAirlines.add(toString(airlines[i]));
			}
		}
		for (int i = 0; i < listOfAirlines.size(); i++)
			System.out.println(listOfAirlines.get(i));
	}
}
