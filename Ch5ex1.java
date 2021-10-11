import javax.swing.*;
import java.util.*;
import java.io.*;
public class Ch5ex1
{
	public static void main(String args[])
	{	
		Scanner console = new Scanner(System.in);
		int num, sum, counter, newnum;
		String outputnum = "";
		System.out.print("Please input a number: ");
		num = console.nextInt();
		System.out.println();
		sum = 0;
		while(num>0)
		{
			newnum = num;
			sum = sum + num % 10;
			num = num/10;
			outputnum = (newnum % 10) + " " + newnum;
		}
		System.out.print(outputnum + " " + "Sum of individuals integers in number: " + sum);
	}
}
			