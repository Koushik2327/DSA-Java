package MainPcak;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		boolean find = false;
		for(int i=0;i<a.length;i++) {
			
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate: "+a[i]);
					find =true;
					break;
					
				}
			}
			
			if(find) {
				break;
			}
		}
		if(!find) {
			System.out.println("no ele");
		}
	}

}
