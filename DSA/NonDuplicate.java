package DSA;

public class NonDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,1,7,8,4};
		for(int i =0;i<arr.length;i++) {
			int count =0;
			for(int j= 0;j<arr.length;j++) {
				if( arr[i]==arr[j]) {
					count++;	
				}				
			}
			if(count==1) {
				System.out.println(arr[i]+" ");
			}
		}

	}

}
