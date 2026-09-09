package searchinTech;

public class RightOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,2,2,2,2,3,4,5};
		int t =2;
		int l=0;
		int r =a.length-1;
		int c=-1;
		
		while(l<=r) {
			int m = (l+r)/2;
			if(a[m]==t) {
				c=m;
				l=m+1;
			}
			else if(a[m]<t) {
				l=m+1;
			}else {
				r=m-1;
			}
		}
		
		System.out.println(c);

	}

}
