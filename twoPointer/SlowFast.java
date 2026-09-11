package twoPointer;

public class SlowFast {
	public static int[]  slowfast(int[] a) {
		int s=0;
		int f =0;
		for(int j=0;j<a.length;j++) {
			if(a[f]!=0) {
				int temp = a[s];
				a[s]=a[f];
				a[f]=temp;
				s++;
			}
			f++;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,0,3,0,4,5};
		SlowFast.slowfast(a);
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}
