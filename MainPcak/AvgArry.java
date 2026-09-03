package MainPcak;

public class AvgArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		double avg = sum/a.length;
		System.out.println(avg);
	}

}
