package searchinTech;

public class Firstocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,2,2,2,2,2,2,2,3,4};
		int t =2;
		int ans =-1;
		int l =0;
		int r = arr.length-1;
		
		while(l<=r) {
			int m = l+r/2;
			if(arr[m]==t) {
				ans =m;
				r = m-1;
			}
			else if(t>arr[m]) {
				l =m+1;
			}else {
				r = m-1;
			}
			
			}
		
		System.out.println("anas: "+ans);
		
		}
	}


