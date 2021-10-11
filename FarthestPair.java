import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
public class FarthestPair
{
	public static void FarthestPair(double[] a)
	{
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double n1 = 0.0;
		double n2 = 0.0;
		int n = a.length;
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] < min)
				min = a[i];
			
			if(a[i] > max)
				max = a[i];
		}
		
		StdOut.println("" + min + ", " + max);
			
		
	}
	
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		double[] a = new double[n];
		
		for(int i = 0; i < n; i++)
			a[i] = StdRandom.uniform();
		
		for(int i =0; i < n; i++)
			StdOut.println(a[i]);

		
		FarthestPair(a);
		
	}
}