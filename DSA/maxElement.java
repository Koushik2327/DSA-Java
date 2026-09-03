package DSA;

public class maxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalsum= 0;
		int arr[]= {1,4,6,7,8};
		for(int i =0;i<arr.length;i++) {
			for(int j= 0;j<arr.length;j++) {
				int sum = arr[i]-arr[j];
				if(sum>totalsum) {
					totalsum =sum;
				}
			}
		}
		System.out.println(totalsum);

	}

}
