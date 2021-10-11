import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.BinarySearch;
import java.util.Arrays;

public class FourSumFast
{
	public static int count(int[] a)
	{
		Arrays.sort(a);
		int n = a.length;
		int count = 0;
		
		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				for(int k = j + 1; k < n; k++)
				{
					if(BinarySearch.indexOf(a, -a[i]-a[j]-a[k]) > k)
						count++;
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