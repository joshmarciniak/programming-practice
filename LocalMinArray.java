import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class LocalMinArray
{
	public static void LocalMinArray(int[] a)
	{
		int i = 1;
		int c = 0;
		int n = a.length;
		
		while(i < n)
		{
			if(a[i] < a[i-1] && a[i] < a[i+1])
			{
				StdOut.println("" + a[i] + " is a local min");
				i += 2;
				c++;
			}
			else
				i++;
		}
	}
	
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-100, 100);
		
		for(int i = 0; i < n; i ++)
			StdOut.println(a[i]);
		
		LocalMinArray(a);
	}
}
	
	