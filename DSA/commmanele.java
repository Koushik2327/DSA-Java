package DSA;

public class commmanele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5,9};
		int arr2[]= {1,4,6,7,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
