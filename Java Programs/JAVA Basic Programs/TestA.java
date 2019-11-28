class TestA
{
	public static void main(String [] args)
	{
		int a = 10;
		int b = 20;
		int c = a++ + b;
		System.out.println("post increment is "+c);
		
		int x = 10;
		int y = 20;
		int z = ++x + y;
		System.out.println("pre increment is "+z);
	}
}