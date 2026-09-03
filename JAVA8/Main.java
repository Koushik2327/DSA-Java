package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<employee> al = new ArrayList<>();
		al.add(new employee(1, "koushik"));
		al.add(new employee(3, "hik"));
		al.add(new employee(2, "kok"));
		al.add(new employee(4, "kshik"));
		
		Comparator<employee> cp = (s1,s2)->s1.empid>s2.empid?1:s1.empid<s2.empid?-1:0;
		Collections.sort(al,cp);
		System.out.println(al);
		
	//--------predifineed functional interface :
		//predicat--> conditional basis; test(r :test
		//Function--> data modified: t,r-->input,return type//perfrom some action produce s0me result :apply
		//consumer--> nothing or void -->i,uzr+ //input void:accept
		//supplier
		
		String[] s1 = {"Koushik","barath","sai"};
		//predicate conditional basis: test()
		Predicate<String> p =s->s.length()>6;
		
		for(String ss :s1) {
			if(p.test(ss)) {
				System.out.println(ss);
			}
		}
		//Function --> perform some action produce or return some result:apply();
		Function<Integer, Integer> f = i->i*i;
		
		System.out.println(f.apply(4));
		System.out.println(f.apply(3));
		System.out.println(f.apply(5));
		System.out.println(f.apply(8));
		
		//Consumer --> input void -: accept(); 
		Consumer<Integer> c1 = c->System.out.println(c+c);
		c1.accept(3);
		c1.accept(6);
		c1.accept(2);
		
		//Supplier - no input--output->get();
		
		Supplier<Date> s3 = ()->new Date();
		System.out.println(s3.get());
		
		Supplier<String> s4 = ()->{
			String otp =" ";
			for(int i=0;i<4;i++) {
				otp = otp+(int)(Math.random()*5);
			}
			return otp;
		};
		
		System.out.println(s4.get());
		
		
		
		
	}

}
