package pack1;

public class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] arr = {10,20,30,20,40,10};
			for(int i=0;i<arr.length-1;i++) {
				for(int j =i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.print(arr[i]+" ");
					}
				}
			}
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				int count =0;
				for(int j =0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count==1) {
					System.out.print(arr[i]+" ");
				}
			}
	}

}
