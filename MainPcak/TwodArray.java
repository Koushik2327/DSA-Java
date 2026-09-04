package MainPcak;

public class TwodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int sum1=0;
		int sum2 =0;int sum3=0;
		int tsum=0;
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum = sum+a[i][j];
			}
			if(i==0) {
				sum1 =sum;
			}
			
			else if(i==1) {
				sum2=sum;
			}
			else if(i==2) {
				sum3=sum;
			}
			tsum +=sum;
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(tsum);
	}

}
