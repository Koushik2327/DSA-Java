package DSA;

class guest{
	void reading(){
		 System.out.println("i can read");
	 }
}

class developer extends guest{
	void write() {
		System.out.println("i can write");
	}
}

class admin extends developer{
	void delete() {
		System.out.println("i can delete");
	}
}

public class main1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		admin a =new admin();
		a.delete();
		a.write();
		a.reading();

	}

}
