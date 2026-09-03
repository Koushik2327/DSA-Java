package DefaultMethod;
interface A{
	default   void demo(){
		System.out.println("hello");
	}
}

interface B{
	 default  void demo() {
		System.out.println("World");
	}
}
public class Demo implements A ,B{
	
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("i can sleep");
		A.super.demo();
		B.super.demo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d =new Demo();
		d.demo();
				

	}


}
