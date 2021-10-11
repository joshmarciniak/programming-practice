import java.util.*;
public class ch3ex3
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		double weightKg;
		System.out.println("Please enter the weight of an individual in kilograms:");
		weightKg = console.nextDouble();
		double weightLb = weightKg *2.2;
		System.out.printf("Weight in kilograms: %.2f%n%nWeight in Pounds: %.2f",weightKg, weightLb);
	}
}
		