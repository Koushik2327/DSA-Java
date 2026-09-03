package MainPcak;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,13,14,15};
		int[] arr1 = new int[arr.length+1];
		
		int n=11;
		int pos = 2;
		for(int i=0;i<pos;i++) {
			arr1[i] = arr[i];
			}
		
		//inserting the position
		arr1[pos]=n;
		
		for(int i=pos;i<arr.length;i++) {
			
			arr1[i+1]= arr[i];
		}
		//insertion of reMANING VALES
		for(int i :arr1) {
			System.out.println(i);
		}
		
	}

}
