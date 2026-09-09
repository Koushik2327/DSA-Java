package searchinTech;

public class Insertpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] a = {1,3,4,5};
		int t =2;
		int c =-1;
		int l=0;
		int r =a.length-1;
		
		while(l<=r) {
			int m = l+r/2;
			if(a[m]<t) {
				l=m+1;
			}else {
				r=m-1;
			}
		}
		System.out.println("dhd: "+l);

	}

}
