package HashMap;

import java.util.Collections;
import java.util.HashMap;

public class MaxElemtsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "koushik";
	
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		int max = Collections.max(map.values());
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))==max) {
				System.out.println("index: "+s.charAt(i));
				return;
				
			}
		}
		
	}

}
