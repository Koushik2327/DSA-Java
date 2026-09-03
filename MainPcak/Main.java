package MainPcak;
class direct{
	static void run() {
		int[] arr2 = {1,2,4,4,};
		for(int i:arr2) {
			System.out.print(i+" ");
		}
	}
}

class index1{
	static void index2() {
	int[] arr2 = {1,2,4,4,};
	for(int i=0;i<arr2.length;i++) {
		System.out.print(i+" ");
	}
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr2 = {1,2,4,4,};
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.println("index: "+i+" "+"value: "+arr2[i]);
		}
	}

}

