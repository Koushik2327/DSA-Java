package JAVA8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Mycomparator {//implements Comparator<Intgeger>
//Comparator 
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		// TODO Auto-generated method stub
//		if(i1<12) {
//			return -1;
//		}else if(i1>i2) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
//		without 
//		Collections.sort(al,new Mycomparator());
//		System.out.println(al);
		
		
		Comparator<Integer> c = (i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
		Collections.sort(al,c);
		System.out.println(al);
		
		
	}
	
}
