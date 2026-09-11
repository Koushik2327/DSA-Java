package twoPointer;

public class OppPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int t =6;
		int l=0;
		int r =a.length-1;
		
		while(l<r) {
			if(a[l]+a[r]==t) {
				System.out.println(a[l]+" "+a[r]);
				l++;
				r--;
				
			}
			else if(a[l]+a[r]<t) {
				l++;
			}else {
				r--;
			}
		}

	}

}
