import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses
{
	public static void main(String[] args)
	{
		Stack <Character> charStack = new Stack<Character>();
		
		char curr;
		
		while(StdIn.hasNextChar())
		{
			curr = StdIn.readChar();
		
			if(curr == '(' || curr == '[' || curr == '{')
				charStack.push(curr);
			
			if(curr == ')' && charStack.peek() == '(')
				charStack.pop();
			else if(curr == ']' && charStack.peek() == '[')
				charStack.pop();
			else if(curr == '}' && charStack.peek() == '{')
				charStack.pop();
		}
		
		StdOut.println(charStack.isEmpty());
	}
}
				
				