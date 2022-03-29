package by.epam.tr.ex3;

import by.epam.tr.ex3.Customer;
import java.util.ArrayList;
import java.util.Scanner;

public class mainCust {
	public static void main(String[] args) {

		Customer[] customers = new Customer[] {
				new Customer(107, "Radyuk", "Nikita", "Olegovich", "Pushkina,36", 7441, 8888),
				new Customer(203, "Kiryuscheva", "Alena", "Aleksandrovna", "Pritytskova,101", 2333, 38438),
				new Customer(10, "Kazyro", "Ilya", "Vladimirovich", "Nezalezhnasti,102", 409, 234),
				new Customer(108, "Mankevich", "Viktor", "Aleksandrovich", "Kolotushkina,208", 2099, 8999) };
		print(customers);
		System.out.println("--------------------------");
		sort(customers);
		System.out.println("--------------------------");
		listByNumber(customers);
	}

	public static String toString(Customer cust) {
		String str;
		str = cust.getID() + " " + cust.getSurname() + " " + cust.getName() + " " + cust.getPatronymic() + " "
				+ cust.getAddress() + " " + cust.getNumOfCard() + " " + cust.getNumOfBankAccount();
		return str;
	}

	public static void print(Customer[] customers) {
		for (int i = 0; i < customers.length; i++)
			System.out.println(toString(customers[i]));
	}

	public static void sort(Customer[] customers) {
		Customer temp;
		for (int i = 0; i < customers.length; i++) {
			for (int j = i + 1; j < customers.length; j++) {
				int compareRez = (customers[i].getSurname()).compareTo(customers[i].getSurname());
				if (compareRez > 0) {
					temp = customers[i];
					customers[i] = customers[i + 1];
					customers[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < customers.length; i++) {
			System.out.println(toString(customers[i]));
		}
	}

	public static void listByNumber(Customer[] customers) {
		ArrayList<String> listOfCustomers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите интервал: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getNumOfCard() > n && customers[i].getNumOfCard() < m) {
				listOfCustomers.add(toString(customers[i]));
			}

		}
		for (int i = 0; i < listOfCustomers.size(); i++)
			System.out.println(listOfCustomers.get(i));
	}
}