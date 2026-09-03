package MainPcak;

public class UpdateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		
		int pos =3;
		int val =12;
		
		for(int i=0;i<arr1.length;i++) {
			if(i==pos) {
				arr1[i]=val;
			}
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}

}
