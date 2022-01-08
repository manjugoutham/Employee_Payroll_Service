package iostream.model;

public class EmployeeData {

	int id;
	String name;
	double salary;

	public EmployeeData()
	{
		
	}
	public EmployeeData(int id,String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
