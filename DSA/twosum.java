package DSA;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target =6;
		int[] arr = {1,2,4,5,7};
		for(int i=0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				if(sum==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
