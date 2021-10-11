//This program was written by Josh Marciniak
public class Words
{
	public static void main(String args[])
	{
		System.out.println("This program demonstrates commonly used string methods.");
		System.out.println("\nThe output displayed uses the string values \"Hi\" and \"Hello World\"");
		String input1 = "Hi";
		String input2 = "Hello World";
		System.out.println("\nThe length of the string \"Hello World\" is " + input2.length() 
						+ "\nThe index of the first character 'o' in \"Hello World\" is " + input2.indexOf('o')
						+ "\nThe index of the second character 'o' in \"Hello World\" is " + input2.indexOf('o', 5)
						+ "\nThe concatenation of \"Hi\" and \"World\" is \"" +input1.concat(" World") + "\""
						+ "\nThe string value \"Hello World\" in all lowercase is " + input2.toLowerCase()
						+ "\nThe string value \"Hello World\" in all uppercase is " + input2.toUpperCase());
	}
}