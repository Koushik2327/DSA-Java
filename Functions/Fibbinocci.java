package Functions;

public class Fibbinocci {
	public static int fibbi(int n) {
		if(n<=1) {
			return 1 ;
		}
		return fibbi(n-1)+fibbi(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibbi(6));
	}

}
