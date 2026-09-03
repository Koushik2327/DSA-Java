package JAVA8;


//================================================================================================
//Using run() method and implementing runnable interface with out lamda
//MyRunnable r = new MyRunnable();
//Thread t = new Thread(r);
//t.start();
//
//}
//
//@Override
//public void run() {
//for(int i =0;i<=10;i++) {
//	System.out.println(i);
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}


public class MyRunnable  {

	public static void main(String[] args) {
		//using lamda expressions performing thread operations
		Runnable r = ()-> {for(int i=0;i<=10;i++) {
			System.out.println("rama thread");
			
		}
		};
		
		Thread t= new Thread(r);
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("seetha thread");
		}

	}

}
