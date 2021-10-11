import java.util.*;
public class Exercise4
{
	public static void main(String args[])
		{
			Scanner console = new Scanner(System.in);
			int SECRET = 11;
			double RATE = 12.50;
			int num1;
			int num2;
			int num3;
			double hoursWorked;
			double wages;
			int newNum;
			String name;
			System.out.print("Please input 2 integers.");
			num1 = console.nextInt();
			num2 = console.nextInt();
			System.out.print("The value of num1 = " + num1 + "\nThe value of num2 = " + num2);
			newNum = num1 * 2 + num2;
			System.out.print("\nThe value of the New Number is " + newNum);
			newNum = newNum + SECRET;
			System.out.print("\nThe value of the new New Number is " + newNum);
			System.out.print("\nPlease enter a person's last name.");
			name = console.next();
			System.out.print("Enter a decimal number between 0 and 70. ");
			hoursWorked = console.nextDouble();
			wages = RATE * hoursWorked;
			System.out.print("Name: " + name + "\nPay Rate: $" + RATE + "\nHours Worked: " + hoursWorked + "\nSalary: $" + wages);
		}
}
			
			
			
			
			
			
			