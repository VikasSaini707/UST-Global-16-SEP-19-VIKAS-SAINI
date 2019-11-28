
public class TestConstructor 
{
	public TestConstructor() {
		System.out.println("TestConstructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main started");
		new TestConstructor();
		System.out.println("main ended");
	}
}
