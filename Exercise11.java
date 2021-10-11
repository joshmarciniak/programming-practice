import java.util.*;
public class Exercise11
{
	public static void main(String args[])
		{
			long secs;
			int sec2;
			long min;
			long hour;
			Scanner console = new Scanner(System.in);
				System.out.print("Enter elapsed time in seconds: ");
					secs = console.nextInt();
			hour = secs/3600;
			int hour2 = (int)secs%3600;
			min = hour2/60;
			sec2 = hour2%60;
				System.out.print(hour + ":" + min + ":" + sec2); 
		}
}
			