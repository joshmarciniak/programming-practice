public class algos1p2
{
	public static void main(String args[])
	{
		double x, y;
		
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		
		if(x > 0 && y > 0 && x < 1 && y < 1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}