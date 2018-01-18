package restrictwhileinserting;

import java.util.ArrayList;
import java.util.Scanner;

public class RestrictDuplicatWhileInserting {

	public static void main(String[] args) {
		int count = 1;
		String option = null;
		Scanner scanner = new Scanner(System.in);
		String choice = null;
		System.out.println("Waht u want to do...Search/Insert (s/i)");
		choice = scanner.nextLine();
		
		ArrayList<Employee> empList = new ArrayList<>();
		if (choice.equalsIgnoreCase("i")) {

			do {
				System.out.println("Enter Employee :: " + count++ + " value");
				Employee employee = new Employee();

				System.out.println("enter Eno");
				employee.setEno(scanner.nextInt());
				scanner.nextLine();

				System.out.println("enter name");
				employee.setName(scanner.nextLine());

				System.out.println("enter salry");
				employee.setSalary(scanner.nextDouble());
				scanner.nextLine();
				
				System.out.println("enter designation");
				employee.setDesignation(scanner.nextLine());

				System.out.println("ENter Department");
				employee.setDepartment(scanner.nextLine());
				
				if (!empList.contains(employee)) {
					empList.add(employee);
				} else {
					System.out.println("Record already available");
				}

				System.out.println("Do u want to continue (Y/N) ");
				option = scanner.nextLine();

			} while (option.equalsIgnoreCase("Y"));
			
	
			System.out.println("elements in ArrayList " + empList);
			// retrieve data
			for (int i = 0; i < empList.size(); i++) {
				Employee employee = empList.get(i);
				if (employee.getDepartment().equalsIgnoreCase("Java")) {
					if (employee.getDesignation().equalsIgnoreCase("TL")) {
						employee.setSalary(employee.getSalary() * 2);
					} else {
						employee.setSalary(employee.getSalary() * 3 / 2);
					}
				}
			}
			System.out.println("updated Employee " + empList);
		} else {
			System.out.println("Enter eno of employee too search");

			Employee employee = new Employee();

			System.out.println("enter Eno");
			employee.setEno(scanner.nextInt());
			scanner.nextLine();
			int index = empList.indexOf(employee);
			if(index!=-1){
				Employee element = empList.get(index);
				System.out.println(element.getEno()+" Slary "+ element.getSalary());
				System.out.println(element.getName()+" department "+ element.getDepartment());
			}else{
				System.out.println("No records found");
			}

		}scanner.close();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee){
			Employee employee=(Employee)obj;
			
		}
		return false;
	}
}