package DSA;

class person{
	int salary =299290;
	
	public void getSalary(int salary) {
		salary= 23333;
		System.out.println(salary);
		System.out.println(this.salary);
	}
}
class main extends person{
	
	int salary =223333;
	public void syso() {
		// TODO Auto-generated method stub
		System.out.println(salary);
		System.out.println(super.salary);

	}
}

public class main2{
	public static void main(String[] args) {
		main m =new main();
		m.syso();
		m.getSalary(52222);
	}
}