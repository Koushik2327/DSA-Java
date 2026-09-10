package searchinTech;

public class FloorSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =26;
		int l=0;
		int  r =n;
		int c =-1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(mid*mid==n) {
				c=mid;
				break;
			}else if(mid*mid<n) {
				l=mid+1;
				c=mid;
			}else r = mid-1;
		}
				
		System.out.println(c);

	}

}
