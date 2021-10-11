import java.util.*;

public class algos1
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		
		int x, y, z;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		z = Integer.parseInt(args[2]);
		
		if(x == y && x == z)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}