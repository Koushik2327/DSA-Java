package DSA;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,1,7,8,4};
		for(int i =0;i<arr.length-1;i++) {
			for(int j= i+1;j<arr.length;j++) {
				if( arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
		}
	


	}

}
