package Oct_24;

public class TestA {
	
		static int a;
		static {
			a=10;
			System.out.println("static block");
		}
		
		TestA()
		{
			System.out.println("TestA() constructor");
		}
		
		public static void main(String[] args) {
			TestA t1 = new TestA();
			TestA t2 = new TestA();
			System.out.println("a value "+a);
		}
		static {
			a=20;
			System.out.println("static block 2");
		}
}
