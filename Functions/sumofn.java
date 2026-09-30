package Functions;

public class sumofn {
	public static int sumofn(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumofn(n-1);
	}
	
	public static int sum(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumofn(6));
		System.out.println(sum(6));
	}

}
