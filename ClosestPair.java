import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
public class ClosestPair
{
	public static void ClosestPair(double[] a)
	{
		double l = Double.MAX_VALUE;
		double n1 = 0.0;
		double n2 = 0.0;
		int n = a.length;
		
		for(int i = 1; i < n; i++)
			if(Math.abs(a[i-1]-a[i]) < l) 
			{
				l = Math.abs(a[i-1]-a[i]);
				n1 = a[i-1];
				n2 = a[i];
			}
			
		StdOut.println("" + n1 + " " + n2);
		
	}
	
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		double[] a = new double[n];
		
		for(int i = 0; i < n; i++)
			a[i] = StdRandom.uniform();
		
		Arrays.sort(a);
		
		ClosestPair(a);
		
	}
}