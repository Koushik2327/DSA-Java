package Functions;

public class recurssion {
	
	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(6);
		System.out.println("-------");
		
		int n=5;
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}

}
