package Functions;

public class reverseString {
	
	
	public static String revSt(String s) {
		if(s.length()<=1) {
			return s;
		}
		return s.charAt(s.length()-1)+revSt(s.substring(0,s.length()-1));
	}
	public static void main(String[] args) {
		System.out.println(revSt("Kosuhik"));
	}

}
