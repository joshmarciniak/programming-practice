import java.util.*;
public class Exercise12
{
	public static void main(String args[])
	{
		int hour;
		int min;
		int secs;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of hours that have elapsed:");
			hour = console.nextInt();
		System.out.print("\nEnter the number of minutes that have elapsed:");
			min = console.nextInt();
		System.out.print("\nEnter the number of seconds that have elapsed:");
			secs = console.nextInt();
		System.out.print("\nEnter the number of seconds that have elapsed:");
		System.out.print("\nTime elapsed before conversion to seconds: " + hour + ":" + min + ":" + secs);
		int sec2 = ((hour * 3600) + (min * 60) + secs);
		System.out.print("\nSeconds elapsed: " + sec2);
	}
}