package SortingMethods;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1};
		boolean swapped;
		for(int i=0;i<a.length-1;i++) {
			swapped=false;
			for(int j =i+1;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
		}

	}

}
