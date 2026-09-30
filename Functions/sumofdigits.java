package Functions;

public class sumofdigits {
	
	public static int sumofd(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sumofd(n/10);
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumofd(12345));
	}

}
