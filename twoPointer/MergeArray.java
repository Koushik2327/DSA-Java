package twoPointer;

public class MergeArray {
	public static int mergeArr(int[] a,int[] b,int c[]) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7};
		int[] b = {2,4,6,8};
		int[] c = new int[a.length+b.length];
		 int size =MergeArray.mergeArr(a, b, c);
		
		for(int i=0;i<size;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
