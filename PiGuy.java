import java.util.*;
import java.io.*;
public class PiGuy
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		double pi =0;
		long i, n;
		System.out.print("Enter the value of n: ");
		System.out.println();
		n=console.nextInt();
		for(i=0; i<n; i++)
		{
			if(i%2==0)
				pi = pi + (double)1/(2*i+1);
			else
				pi = pi - (double)1/(2*i+1);
		}
		pi = 4*pi;
		System.out.println("pi = " + pi);
	}
}
		