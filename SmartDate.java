import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class SmartDate 
{
	private final int month;
	private final int day;
	private final int year;
	
	private static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static int[] daysLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public SmartDate(int m, int d, int y)
	{
		if(m > 12 || m < 1)
			throw new RuntimeException("Invalid Month");
		else
			month = m;
		
		if(d < 1 || d > (days[m - 1]))
			throw new RuntimeException("Invalid date");
		else
			day = d;
		
		if(y < 1)
			throw new RuntimeException("Invalid Year");
		else
			year = y;
		
	}
	
	public int month()
	{ 
		return month;
	}
	
	public int day()
	{
		return day;
	}
	
	public int year()
	{
		return year;
	}
	
	public String toString()
	{
		return month() + "/" + day() + "/" + year();
	}
	
	public String dayOfTheWeek()
	{
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String result;
		int startDay = 0;
		int yearAddition = 0;
		int monthAddition = day();
		int totalDays;
		
		for(int i = 2001; i < this.year; i++)
		{
			if(!isLeapYear(i))
				yearAddition += 365;
			else
				yearAddition += 366;
		}
		
		for(int i = 0; i < month() - 1; i++)
			if(!isLeapYear(this.year))
				monthAddition += this.days[i];
			else
				monthAddition += this.daysLeap[i];
		
		totalDays = monthAddition + yearAddition;
		
		result = weekdays[(totalDays%7) - 1];
		
		return result;

	}
	
	private static boolean isLeapYear(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }
	
	public static void main(String[] args)
	{
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		SmartDate date = new SmartDate(m, d, y);
		StdOut.println(date);
		StdOut.println(date.dayOfTheWeek());
	}
}
		
		