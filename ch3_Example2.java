import java.util.*;
public class ch3_Example2
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		double height;
		double radius;
		double PI = 3.14159;
		System.out.println("Enter the height of the cylinder: ");
		height = console.nextDouble();
		System.out.println("Enter the radius of the base of the cylinder: ");
		radius = console.nextDouble();
		System.out.printf("Volume of the cylinder = %.2f%n%n", Math.pow(radius,2.0)*height*PI);
		System.out.printf("Surface Area of the cylinder = %.2f",(2*PI*radius*height)+(Math.pow(radius,2.0)*2*PI));
	}
}