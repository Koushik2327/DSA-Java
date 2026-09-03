package MainPcak;

public class DeleteCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[arr.length-1];
		
		int pos= 2;
		
		for(int i=0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		
		for(int i=pos;i<arr1.length;i++) {
			arr1[i]=arr[i+1];
		}
		
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}

}
