package HashMap;

import java.util.HashMap;

//complexity wise o(1)-hash map
public class HashMapDempo {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,4,2};
		int t= 9;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int c= t-arr[i];
			if(hm.containsKey(c)) {
				System.out.println("indexs: "+hm.get(c)+" "+i);
				return;
			}
			hm.put(arr[i],i);
		}
		System.out.println("not found");
		
	}

}
