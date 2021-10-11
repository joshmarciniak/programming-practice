public class test
{
	public static String mystery(String s)
	{
		int n = s.length();
		if(n<= 1) return s;
		String a = s.substring(0, n/2);
		String b = s.substring(n/2, n);
		return mystery(b) + mystery(a);
	}
	public static void main(String[] args)
	{
		String string1 = "hello";
		String string2 = string1;
		string1 = "world";
		System.out.println(string1);
		System.out.println(string2);
		
		String s = "Hello World";
		s.toUpperCase();
		s.substring(6,11);
		System.out.println(s);
		
		System.out.println(mystery("Hello World"));
	}
}