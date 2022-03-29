package by.epam.tr.ex2;

import by.epam.tr.ex2.*;
import java.util.Scanner;

public class Airline {
	private double time;
	private String destination;
	private String type;
	private int numOfFlight;
	private String dayOfWeek;

	public Airline(double time, String destination, String type, int numOfFlight, String dayOfWeek) {
		this.time = time;
		this.destination = destination;
		this.type = type;
		this.numOfFlight = numOfFlight;
		this.dayOfWeek = dayOfWeek;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

//
	public String getDestination() {
		return destination;
	}

	public void SetDestination(String destination) {
		this.destination = destination;
	}

//			
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//
	public int getNumOfFlight() {
		return numOfFlight;
	}

	public void setNumOfFlight(int numOfFlight) {
		this.numOfFlight = numOfFlight;
	}

//
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}