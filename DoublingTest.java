import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.ThreeSum;


public class DoublingTest
{
	public static double timeTrial(int n)
	{
		int MAX = 1000000;
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.uniform(-MAX, MAX);
		Stopwatch timer = new Stopwatch();
		int count = ThreeSum.count(a);
		return timer.elapsedTime();
	}
	
	public static void plot()
	{
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(.01);
		StdDraw.setXscale(0, 8500);
		StdDraw.setYscale(-1, 100);
		for (int n = 250; true; n *= 2)
		{
			double time = timeTrial(n);
			
			StdDraw.point(n, time);
			StdOut.printf("%7d %7.1f\n", n, time);
		}
		
	}

	public static void main(String[] args)
	{
		plot();
	}
}