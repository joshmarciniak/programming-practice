import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class algos1p23
{
	public static void main(String[] args)
	{
		int n;
		double min, max;
		
		n = Integer.parseInt(args[0]);
		min = Double.parseDouble(args[1]);
		max = Double.parseDouble(args[2]);
		
		Interval2D[] intervals = new Interval2D[n];
		
		for(int i = 0; i < n; i++)
		{
			double x1, x2, y;
			
			x1 = StdRandom.uniform(min, max);
			x2 = StdRandom.uniform(x1, max);
			y = StdRandom.uniform(x2, max);
			
			Interval1D i1 = new Interval1D(x1, x2);
			Interval1D i2 = new Interval1D(x2, y);
			
			Interval2D box = new Interval2D(i1, i2);
			intervals[i] = box;
			box.draw();
		}
		
		int containsCount, intersectsCount;
		containsCount = 0;
		intersectsCount = 0;
		
		for(int j = 0; j < intervals.length; j++)
		{
			for(int k = j + 1; k < intervals.length; k++)
			{
				if(intervals[j].intersects(intervals[k]) == true)
					intersectsCount++;
				
			}
		}
		System.out.println(intersectsCount);
				
				
	}
}