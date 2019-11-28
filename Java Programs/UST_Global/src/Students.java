
public class Students 
{
	String name;
	int age;
	int id;
	String branch;
	String college;
	
	public Students(String name,int age,int id,String branch,String college)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.branch=branch;
		this.college=college;
	}
	void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The id is "+id);
		System.out.println("The branch is "+branch);
		System.out.println("The college is "+college);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Students s1= new Students("Vini",23,7,"ECE","ACE");
		s1.display();
		
		Students s2= new Students("Manu",22,8,"ECE","KCE");
		s2.display();
		
		Students s3= new Students("Rakesh",21,17,"CSE","KUT");
		s3.display();
		
		Students s4= new Students("Ashu",25,16,"IT","ACE");
		s4.display();
		
		Students s5= new Students("Aman",22,22,"ECE","ACE");
		s5.display();
		
		Students s6= new Students("Kunal",27,2,"ME","IIT");
		s6.display();
		
		Students s7= new Students("Geetu",23,27,"EEE","IISC");
		s7.display();
		
		Students s8= new Students("Anku",18,9,"BT","ACE");
		s8.display();
		
		Students s9= new Students("Milan",21,10,"CE","KUK");
		s9.display();
		
		Students s10= new Students("Priya",20,17,"CSE","BCE");
		s10.display();
	}
}
