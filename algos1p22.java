import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class algos1p22
{
	public static void main(String[] args)
	{
		int n;
		double x, y;
		n = Integer.parseInt(args[0]);
		
		Interval1D[] intervals = new Interval1D[n];
		
		for(int i = 0; i < n; i++)
		{
			x = StdIn.readDouble();
			y = StdIn.readDouble();
			
			Interval1D interval = new Interval1D(x, y);
			intervals[i] = interval;
		}
		
		for(int j = 0; j < intervals.length; j++)
		{
			for( int k = j + 1; k < intervals.length; k++)
			{
				if(intervals[j].intersects(intervals[k]) == true)
					StdOut.println("Interval ( " + intervals[j].min() + ", " + intervals[j].max() + ") intersects interval (" +
									intervals[k].min() + ", " + intervals[k].max() + ").");
			}
		}
	}
}