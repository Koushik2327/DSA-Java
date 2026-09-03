package MainPcak;

public class MissingTerms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,0,6};
		int sum= 0;
		
		int len=0;
		for(int i= 1;i<=a.length;i++) {
			len+=i;
		}
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		int res =len-sum;
		System.out.println(res);
	}

}
