package MainPcak;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,3,4,4,2,5};
		
		for(int i =0;i<a.length;i++) {
			int count =0;
			for(int j =0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
			if(count ==1) {
				System.out.println(a[i]);
			}
		}

	}

}
