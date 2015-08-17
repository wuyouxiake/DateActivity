import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Random;

public class ConvertDate {
	// public GregorianCalendar startDate;
	private long elapsedDay;
	private String weekday;
	private String weather;
	private int temp;

	public void setElapsedDay(GregorianCalendar a) {

		GregorianCalendar now = new GregorianCalendar();
		Date start = a.getTime();
		long startDateMS = start.getTime();
		Date end = now.getTime();
		long endDateMS = end.getTime();

		long elapsedMS = endDateMS - startDateMS;
		elapsedDay = elapsedMS / (24 * 60 * 60 * 1000);
	}

	public long getElapsedDay() {
		return elapsedDay;

	}

	// set weekday
	public void setWeekday(GregorianCalendar a) {

		int dayOfWeek = a.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == 2) {
			weekday = "Monday";
		} else if (dayOfWeek == 3) {
			weekday = "Tuesday";
		} else if (dayOfWeek == 4) {
			weekday = "Wednesday";
		} else if (dayOfWeek == 5) {
			weekday = "Thursday";
		} else if (dayOfWeek == 6) {
			weekday = "Friday";
		} else if (dayOfWeek == 7) {
			weekday = "Saturday";
		} else if (dayOfWeek == 1) {
			weekday = "Sunday";
		}
	}

	public String getWeekday() {
		return weekday;
	}

	public String toString() {
		Random r = new Random(this.elapsedDay);
		temp = -20 + r.nextInt(80);
		int y = 1 + r.nextInt(3);
		if (y == 1) {
			weather = "sunny";
		} else if (y == 2) {
			weather = "rainy";
		} else {
			weather = "cloudy";
		}
		return "That was a " + this.getWeekday() + " . It was a "
				+ this.weather + " day and the temperature averaged "
				+ this.temp + " degrees. It was " + this.getElapsedDay()
				+ " days ago.";
	}
}