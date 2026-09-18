package HashMap;

import java.util.HashMap;

public class FirstnonRepertingElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "koushik";
	
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))==1) {
				System.out.println("index: "+i);
				return;
				
			}
		}
		
	}

}
