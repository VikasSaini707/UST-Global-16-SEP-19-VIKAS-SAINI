
public class Person {
	String name;
	int age;
	
	Person(String pname,int page)
	{
		name=pname;
		age=page;
	}
	
	void PrintDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
	public static void main(String[] args) {
		Person p1 =new Person("divya",20);
		Person p2 =new Person("Priya", 40);
		p1.PrintDetails();
		p2.PrintDetails();
	}
}
