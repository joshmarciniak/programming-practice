public class Example1
{
	public static void main(String args[])
	{
		double hours = 35.45;
		double rate = 15.00;
		double tolerance = 0.01000;
		System.out.println("Fixed decimal notation:");
		System.out.printf("hours = %.2f, rate = %.2f, pay = %.2f,"
							+ " tolerance = %.2f%n%n", 
								hours, rate, hours*rate, tolerance);
	}
}
		