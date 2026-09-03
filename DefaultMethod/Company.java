package DefaultMethod;
interface Employee{
	void work();
	
	static void companyName() {
		System.out.println("soso");
	}
}

class Developer implements Employee{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("my WOrk");
		
	}
	
}
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer();
		d.work();
		Employee.companyName();

	}

}
