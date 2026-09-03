package JAVA8;
//Lamda expression
//lamda expression:
//
//to call lamda expression wew need -functionla interface-only with on abstract method
//
//intriducing functional programming into jva to concsise the code
//
//it is an anoanmous /nameless function which is used to provide intefac--->implementaion
//
//the function don't have access modifier any return type any method name.
//
//()-> slim arrow function
//=> fat arrow function
//
//()->{syso("kkass")};
//
//()->24;
@FunctionalInterface
interface Calculator{
	public int add(int a ,int b);
}

public class democlass {
	public static void main(String[] args) {
		
		
//		Calculator cat = new Calculator() {
//			@Override
//			public int add(int a,int b) {
//				return a+b;
//			}
//		};
		Calculator ct =(int a,int b)->{return a+b;};
		System.out.println(ct.add(12, 2));
	}
}
