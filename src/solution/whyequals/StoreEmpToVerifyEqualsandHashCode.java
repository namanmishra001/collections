package solution.whyequals;

import java.util.LinkedHashSet;

public class StoreEmpToVerifyEqualsandHashCode {

/*
 * if u want to stop dulicate's datawise override equals 
 * 
 * 	*/
	public static void main(String[] args) {
		LinkedHashSet<Object> l = new LinkedHashSet<>();
		l.add(new Employee(1, "Naman", 10000d));
		l.add(new Employee(2, "Aman", 10000d));
		l.add(new Employee(1, "Naman", 10000d));
		l.add(new Employee(3, "Suraj", 1000d));
		l.add(new Employee(4, "Abc", 100d));
		System.out.println(l);
	}

}
