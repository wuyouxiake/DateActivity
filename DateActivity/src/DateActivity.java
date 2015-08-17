import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;

public class DateActivity {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String a = "y";
		while (a.equalsIgnoreCase("y")) {
			// Prompt the user to enter the date
			System.out.println("What is the date that you are asking about? :");
			String aaa = in.next();

			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			String cunvertCurrentDate = aaa;
			Date date1 = new Date();
			date1 = df.parse(cunvertCurrentDate);
			// System.out.println(date1);

			Calendar cal = Calendar.getInstance();
			cal.setTime(date1);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int day = cal.get(Calendar.DAY_OF_MONTH);

			// System.out.println(year +" "+ (month)+" "+day );
			GregorianCalendar d = new GregorianCalendar(year, month, day);
			// d.set(year, month, day);
			// System.out.println(d.get(Calendar.DAY_OF_WEEK));
			// System.out.println(d.get(Calendar.YEAR));
			// System.out.println(d.get(Calendar.MONTH));
			// System.out.println(d.get(Calendar.DAY_OF_MONTH));
			// System.out.println();//SUN-3;

			ConvertDate cd = new ConvertDate();
			cd.setElapsedDay(d);
			cd.setWeekday(d);

			System.out.println(cd.toString());

			System.out.println("Continue?(y/n)");
			a = in.next();
		}
	}
}