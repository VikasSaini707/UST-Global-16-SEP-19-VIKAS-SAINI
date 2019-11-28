
public class Employee {
	String name;
	int eid;
	
	public Employee(String name, int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	void printDetails()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Deepika",20);
		e1.printDetails();
		Employee e2 = new Employee("Alia",30);
		e2.printDetails();
		Employee e3 = new Employee("Priyanka",40);
		e3.printDetails();
	}
}
