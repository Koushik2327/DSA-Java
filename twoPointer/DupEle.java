package twoPointer;

public class DupEle {
	public static int removeDup(int[] a) {
		int s=0;
		
		for(int f=1;f<a.length;f++) {
			if(a[f]!=a[s]) {
				s++;
				a[s]=a[f];
			}
		}
		
		return s+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,2,3,4,4,5};
		int n=DupEle.removeDup(a);
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
