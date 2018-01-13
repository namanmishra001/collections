package solution.whyequals;

public class Employee {

	private Integer eno;
	private String name;
	private Double salary;

	public Employee(Integer eno, String name, Double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eno == null) ? 0 : eno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	// if equals() returns TRUE object is not added
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			return this.name.equals(e.name) && this.eno == e.eno;
		}
		return false;// object is added
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}

}
