
package MainPcak;
public class ZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,2,3,0,3,0,6};
		int index = 0;
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]==0) {
//				for(int j=i+1;j<a.length;j++) {
//					if(a[j]!=0) {
//						int temp =a[i];
//						a[i]= a[j];
//						a[j]=temp;
//					}
//				}
//			}
//		}
		for(int i =0;i<a.length;i++) {
			if(a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		
		while(index<a.length) {
			a[index]=0;
			index++;
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
