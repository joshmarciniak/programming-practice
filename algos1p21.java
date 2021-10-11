import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Point2D;

public class algos1p21
{
	public static void main(String[] args)
	{
		int n;
		n = Integer.parseInt(args[0]);
		Point2D[] points = new Point2D[n];
		
		
		
		for(int i = 0; i < n; i++)
		{
			double x = StdRandom.uniform(0.0, 1.0);
			double y = StdRandom.uniform(0.0, 1.0);
			Point2D p = new Point2D(x, y);
			p.draw();
			points[i] = p;
		}
		double min = points[0].distanceTo(points[1]);
		
		for(int i = 1; i < points.length; i++)
		{
			for(int j = i + 1; j < points.length; j++)
			{
				if(points[i].distanceTo(points[j]) < min)
				{
					min = points[i].distanceTo(points[j]);
				}
			}
		}
		
		System.out.println("The distance between the closest pair of points is " + min);
		
		
	}
}