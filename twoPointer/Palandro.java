package twoPointer;

public class Palandro {
	public static void isPal(String s) {
		int l=0;
		int r =s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				System.out.println("Not pal");
				return;
			}
			l++;
			r--;
		}
		System.out.println("is pal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="level";
		Palandro.isPal(s);
	}

}
