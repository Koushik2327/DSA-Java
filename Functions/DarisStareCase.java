package Functions;

public class DarisStareCase {
	
	public static int stair(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		return stair(n-1)+stair(n-2)+stair(n-3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stair(4));

	}

}
