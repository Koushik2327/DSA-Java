package searchinTech;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =81;
		int l =1;
		int r =n;
		int c =-1;
		
		while(l<=r) {
			int m =(l+r)/2;
			if(m*m==n) {
				c=m;
				break;
			}else if(m*m<n) {
				l=m+1;
			}else {
				r=m-1;
			}
		}
		
		System.out.println(c);

	}

}
