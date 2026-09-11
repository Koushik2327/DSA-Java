package twoPointer;

public class ReverseAarr {
	public static void rev(int[] a) {
		int l=0;
		int r =a.length-1;
		while(l<=r) {
			int temp = a[l];
			a[l]=a[r];
			a[r]= temp;
			l++;
			r--;
		}
		for(int i :a) {
			System.out.print(i+" ");
		}
	}
	public static void revWithout3rdvariable(int[] a) {
		int l=0;
		int r =a.length-1;
		while(l<r) {
			a[l]=a[l]+a[r];
			a[r]=a[l]-a[r];
			a[l]=a[l]-a[r];
			l++;
			r--;
		}
		for(int i :a) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		ReverseAarr.rev(a);
		System.out.println();
		ReverseAarr.revWithout3rdvariable(a);
	}

}
