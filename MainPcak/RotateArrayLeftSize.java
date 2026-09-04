package MainPcak;

public class RotateArrayLeftSize {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int k=2;
		for(int i=1;i<=k;i++) {
			int first = a[0];
			for(int j =0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}
