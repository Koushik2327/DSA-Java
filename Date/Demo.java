package Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDate tmw = date.plusDays(1);
		System.out.println(tmw);
		
		LocalDate months = date.plusMonths(2);
		System.out.println(months);
		System.out.println("year"+date.getYear());
		System.out.println("mounth"+date.getMonth());
		
		LocalTime time = LocalTime.now();
		System.out.println("hours: "+time.getHour());
		
		//set date and time
		
		LocalDate sd = date.of(2004, 2, 23);
		System.out.println(sd);
		LocalTime td = time.of(2, 40);
		System.out.println(td);
		
		LocalDate dt = LocalDate.of(2004, 10, 30);
		System.out.println(dt);
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
//		System.out.println(formatter);
		
//		String result = dt.format(formatter);
		
		
		LocalDate bdy = LocalDate.of(2004,02, 23);
		LocalDate tdy = LocalDate.now();
		
		Period p = Period.between(bdy, tdy);
		System.out.println(p.getDays()+"-"+p.getMonths()+"-"+p.getYears());

	}

}
