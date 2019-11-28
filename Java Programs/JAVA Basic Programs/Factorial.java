class Factorial
{
	public static void main(String [] args)
	{
		int fac = fact(5);
		System.out.println("Factorial of number is "+fac);
		hello("Hello How are You");
	}

	static int fact(int num)
	{
		int res = 1;
		while(num>0)
		{
			res = res*num;
			num--;
		}
		return res;
	}

	static void hello(String s)
	{
		System.out.println(s);
	}

}