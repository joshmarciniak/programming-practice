import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class ThreeSumFaster
{

	public static int count(int[] a)
	{
		Arrays.sort(a);
		int n = a.length;
		int count = 0;
		int lo, hi;
		
		for(int i = 0; i < n; i++)
		{
			lo = i + 1;
			hi = n-1;
			while(lo < hi)
			{
				if(a[lo] + a[hi] == -a[i])
				{
					count++;
					hi--;
					lo++;
				}
				else if(a[lo] + a[hi] < -a[i])
					lo++;
				else
					hi--;
			}
		}
		return count;
	}
	
	public static void main(String [] args)
	{
		In in = new In(args[0]);
		int[] a = in.readAllInts();
		StdOut.println(count(a));
	}
}