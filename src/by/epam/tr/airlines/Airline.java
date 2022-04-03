package by.epam.tr.airlines;

import java.util.Scanner;

import by.epam.tr.airlines.*;

public class Airline {
	private String destination;
	private String type;
	private int numOfFlight;
	private DayWithTime dayWithTime;

	public Airline(String destination, String type, int numOfFlight, double time, String dayOfWeek) {
		this.destination = destination;
		this.type = type;
		this.numOfFlight = numOfFlight;
		dayWithTime = new DayWithTime(dayOfWeek, time);
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
	public DayWithTime getDayWithTime() {
		return dayWithTime;
	}

	public void setDayWithTime(DayWithTime dayWithTime) {
		this.dayWithTime = dayWithTime;
	}

}