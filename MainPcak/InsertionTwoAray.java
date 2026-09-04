package MainPcak;

public class InsertionTwoAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,4,6};
		int[] b = {2,3,3,4};
		int[] c = {1,4,5,3};
		for(int i=0;i<a.length;i++) {
			boolean dup =false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					
					dup = true;
					break;
				}
			}
			
			if(dup) {
				continue;
			}
			boolean bdup = false;
			for(int k=0;k<b.length;k++) {
				if(a[i]==b[k]) {
					bdup = true;
				}
			}
			
			boolean cdup =false;
			for(int h =0;h<c.length;h++) {
				if(a[i]==c[h]) {
					cdup =true;
				}
			}
			
			if(bdup==true&&cdup==true) {
				System.out.println(a[i]);
			}
			
			
		}
		
	}

}
