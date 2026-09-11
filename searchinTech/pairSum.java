package searchinTech;

public class pairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6};
		int t = 6;
		boolean found =false;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					System.out.println(arr[i]+" "+arr[j]);
					found=true;
				
				}
				
			}
			
		}
		if(!found) {
			System.out.println("not found");
		}
	}

}
