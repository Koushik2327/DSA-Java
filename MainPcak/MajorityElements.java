package MainPcak;

public class MajorityElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,1,4,5,7,5,2,2,2,2,2};
		int maj=-1;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
			int b = a.length/2;
			if(count>b) {
				maj =a[i];
				break;
			}
		}
		System.out.println(maj);

	}

}
