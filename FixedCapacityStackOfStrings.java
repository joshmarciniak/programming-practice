import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class FixedCapacityStackOfStrings
{
	private String[] a;
	private int n;
	private int capacity;
	
	public FixedCapacityStackOfStrings(int capacity)
	{
		this.capacity = capacity;
		a = new String[this.capacity];
	}
	
	public boolean isEmpty()
	{
		return n==0;
	}
	
	public boolean isFull()
	{
		return n == this.capacity;
	}
	
	public int size()
	{
		return n;
	}
	
	public void push(String item)
	{
		a[n++] = item;
	}
	
	public String pop()
	{
		return a[--n];
	}
	
	public static void main(String[] args)
	{
		FixedCapacityStackOfStrings s;
		s = new FixedCapacityStackOfStrings(100);
		while(!StdIn.isEmpty())
		{
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
			
			if(!s.isFull())
				StdOut.println("Stack not full");
			else
				StdOut.println("Stack Full");
				break;
		}
		
		StdOut.println("(" + s.size() + " left on stack)");
	}
}
	
	
	