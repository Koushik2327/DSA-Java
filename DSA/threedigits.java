package DSA;

public class threedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5};
		int count =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					for(int k =0;k<arr.length;k++) {
						
						if(arr[k]!=arr[i]&&arr[k]!=arr[j]) {
							int num = arr[i]*100+arr[j]*10+arr[k];
							System.out.println(num);
							count++;
						}
					}
				}
			}
		}

	}

}
