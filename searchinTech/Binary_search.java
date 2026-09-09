package searchinTech;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"Bahu","cartoon","deathrace"};
		String target = "cartoon";
		int left =0;
		int right = a.length-1;
		while(left<=right) {
			int mid = left+right/2;
			int comp = a[mid].compareTo(target);
			if(comp==0) {
				System.out.println("element found at:" +mid);
				return;
			}
			else if(comp>0) {
				left =mid-1;
			}else {
				right = mid+1;
			}
		}
		System.out.println("not found");
	}

}
