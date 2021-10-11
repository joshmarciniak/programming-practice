import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class VisualCounter{
	
	private int counter = 0;
	private int opNum = 0;
	private int max, n;
	
	public VisualCounter(int n, int max){
		
		this.max = max;
		this.n = n;
		StdDraw.setXscale(0, n);
		StdDraw.setYscale(-max, max) ;
		StdDraw.setPenRadius(0.005);
		StdDraw.line(0, 0, n, 0);
	}
	
	public void increment()
	{
		opNum += 1;
		if(opNum < this.n && Math.abs(this.counter) <= this.max)
		{
			this.counter++;
			addDataValue(opNum, this.counter);
		}
	}
	
	public void decrement()
	{
		opNum += 1;
		if(opNum < this.n && Math.abs(this.counter) <= this.max)
		{
			this.counter--;
			addDataValue(opNum, this.counter);
		}
	}
	
	public void addDataValue(int x, int y)
	{
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(x, y);
	}
	
	public static void main(String[] args)
	{
		int n, max;
		
		n = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[1]);
		VisualCounter c = new VisualCounter(n, max);
		
		for(int i = 0; i < n; i++)
		{
			if(Math.random() < 0.5) c.increment();
			else c.decrement();
		}
		
	}
}
		