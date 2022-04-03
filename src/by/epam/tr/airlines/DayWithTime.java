package by.epam.tr.airlines;

public class DayWithTime {
	private String dayOfWeek;
	private double time;

	public DayWithTime(String dayOfWeek, double time) {
		this.dayOfWeek = dayOfWeek;
		this.time = time;
}
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

//
	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
}
