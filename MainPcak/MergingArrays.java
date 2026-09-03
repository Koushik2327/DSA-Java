package MainPcak;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[] b = {2,3,4};
		
		int[] mer = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			mer[i] = a[i];
		} 
		
		for(int i=0;i<b.length;i++) {
			mer[a.length+i] = b[i];
		}
		
		System.out.println(Arrays.toString(mer));
	}

}
