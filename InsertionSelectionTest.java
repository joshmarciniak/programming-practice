import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;

public class InsertionSelectionTest
{
	/**public static void SelectionSort(int[] a)
	{
		int n = a.length;
		for (int i = 0; i < n; i++)
		{
			int min = i;
			for (int j = i + 1; j < n; j++)
				if(less(a[j], a[min])) min = j;
			exchange(a, i, min);
		}
	}
	
	public static void InsertionSort(int[] a)
	{
		int n = a.length;
		for (int i = 1; i < n; i++)
		{
			for (int j = i; j > 0 && less(a[j], a[j -1]); j--)
				exchange(a, j, j - 1);
		}
	}**/
	
	public static void main(String[] args)
	{
		Comparable[] a1 = new Comparable[100];
		Comparable[] a2 = new Comparable[100];
		
		for(int i = 100; i > 0; i--)
		{
			a1[i - 1] = i;
			a2[i - 1] = i;
		}
			
		Stopwatch timer1 = new Stopwatch();
		Selection.sort(a1);
		StdOut.println("Selection Sort: " + timer1.elapsedTime());
		
		Stopwatch timer2 = new Stopwatch();
		Insertion.sort(a2);
		StdOut.println("Insertion Sort: " + timer2.elapsedTime());
		
	}
}
			