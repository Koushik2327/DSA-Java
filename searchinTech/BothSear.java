package searchinTech;

public class BothSear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,2,2,2,2,3,4,5};
		int t =2;
		int l=0;
		int r =a.length-1;
		int l2=0;
		int r2 =a.length-1;
		int c1=-1;
		int c2=-1;
		
		while(l<=r) {
			int m=(l+r)/2;
			if(a[m]==t) {
				c1=m;
				l=m+1;
			}else if(a[m]<t) {
				l=m+1;
			}else {
				r=m-1;
			}
		}
		while(l2<=r2) {
			int m=(l2+r2)/2;
			if(a[m]==t) {
				c2=m;
				r2=m-1;
			}else if(a[m]<t) {
				l2=m+1;
			}else {
				r2=m-1;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	}

}
