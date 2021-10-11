import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class InfixCheck
{
	public static void main(String[] args)
	{
		Stack<String> operator = new Stack<String>();
		Stack<String> operand = new Stack<String>();
		
		while(!StdIn.isEmpty())
		{
			String input = StdIn.readString();
			
			if(input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/"))
				operator.push(input);
			else if(input.equals(")"))
			{
				String op = operator.pop();
				String op1 = operand.pop();
				String op2 = operand.pop();
				String newString = "( " + op2 + " " + op + " " + op1 + " )";
				
				operand.push(newString);
			}
			else
				operand.push(input);
		}
		
		while(!operand.isEmpty())
			StdOut.println(operand.pop() + " ");
	}
}
		