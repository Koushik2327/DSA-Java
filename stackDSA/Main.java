package stackDSA;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// Stack creation
		Stack<Integer> s = new Stack<>();
		
		//push operation
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		//pop operation
		s.pop();
		
		//peek operation
		int res = s.peek();
		System.out.println(res);
		
		//isEmpty operation
		System.out.println(s.isEmpty());
		
		//get methop
		System.out.println(s.get(2));
		
		System.out.println(s);
		
	}

}
