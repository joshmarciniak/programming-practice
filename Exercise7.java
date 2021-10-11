import java.util.*;
public class Exercise7
{
	public static void main(String args[])
		{
			double score1;
			double score2;
			double score3;
			double score4;
			double score5;
			double scoreAvg;
				Scanner console = new Scanner(System.in);
				System.out.print("Enter 5 test scores. ");
				score1 = console.nextDouble();
				score2 = console.nextDouble();
				score3 = console.nextDouble();
				score4 = console.nextDouble();
				score5 = console.nextDouble();
					scoreAvg = (score1 + score2 + score3 + score4 + score5)/5;
					System.out.print("The average of your scores is " + scoreAvg);
		}
}