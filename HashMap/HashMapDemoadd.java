package HashMap;

import java.util.HashMap;

public class HashMapDemoadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,4,2};
		
		int k= 2;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int num =a[i];
			if(map.containsKey(num-k)) {
				System.out.println("pair found");
				System.out.println("indexes: "+map.get(num-k)+" "+i);
				System.out.println("values: "+(num-k)+" "+num);
				return;
			}
			if(map.containsKey(num+k)) {
				System.out.println("pair found");
				System.out.println("indexes: "+map.get(num+k)+" "+i);
				System.out.println("values: "+(num+k)+" "+num);
				return;
			}
			
			map.put(num, i);
		}
		System.out.println("not found");
	}

}
