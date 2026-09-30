package Functions;

public class sumofDigi {
	public static int digi(int n) {
		if(n<10) {
			return n;
		}
		int sum =0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		return digi(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digi(9854));
	}

}
