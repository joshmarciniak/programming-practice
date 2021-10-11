public class algos1p3{
	public static void main(String args[]){
		
		int n = Integer.parseInt(args[0]);
		String s = "";
		
		for(int k = n; k > 0; k /= 2)
			s = (k % 2) + s;
		
		System.out.println(s);
	}
}