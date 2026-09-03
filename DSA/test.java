package DSA;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			if(i%3 ==0&&i%5==0) {
				System.out.println(i+" is Fizzbuzz");
			}else if(i%3==0){
				System.out.println(i+" is Fizz");
			}else if(i%5==0) {
				System.out.println(i+" is Buzz");
			}else {
				System.out.println(i);
			}
		}

	}

}
