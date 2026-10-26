package stackDSA;

import java.util.Stack;

public class DesignStack {
	
	static Stack<Integer> st = new Stack<>();
	static Stack<Integer> minst = new Stack<>();
	
//	Pushing Elements
	public void pushing(int value) {
			//st.push(value);
			minst.push(value);
			if(minst.isEmpty()||value<=minst.peek()) {
				minst.push(value);
			}
	}
	
	//Popping elements
	public static void pooping() {
		if(minst.peek().equals(minst.peek())) {
			minst.pop();
		}
		minst.pop();
	}
	
	//Top Element
	public int topEle() {
		return minst.peek();
	}
	
	//Minimum Element
	public int getMin() {
		return minst.peek();
	}
	
	
	public static void main(String[] args) {
		DesignStack ds = new DesignStack();
		ds.pushing(5);
		ds.pushing(-2);
		ds.pushing(0);
		ds.pushing(-3);
		ds.pushing(1);
		ds.pushing(-7);
		
		
		System.out.println(ds.topEle());
		System.out.println(ds.getMin());
		ds.pooping();
		System.out.println(ds.topEle());
		System.out.println(ds.getMin());
		System.out.println();
	}

}
