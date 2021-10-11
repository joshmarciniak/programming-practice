import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.math.BigInteger;

public class ThreeSum
{
	public static int count(int[] a)
	{
		int n = a.length;
		int count = 0;
		
		for (int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				for(int k = j + 1; k < n; k++)
				{
					BigInteger big = BigInteger.valueOf(0);
					big = big.add(BigInteger.valueOf(a[i]));
					big = big.add(BigInteger.valueOf(a[j]));
					big = big.add(BigInteger.valueOf(a[k]));
					if (big == BigInteger.valueOf(0))
						count++;
				}
		return count;
	}
	
	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] a = in.readAllInts();
		StdOut.println(count(a));
	}
}