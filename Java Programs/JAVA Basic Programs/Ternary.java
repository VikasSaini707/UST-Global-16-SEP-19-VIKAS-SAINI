class Ternary
{
	public static void main(String [] args)
	{
		int a = 70;
		int b = 80;
		int c = 30;
		int d = a>b && a>c ? a : b>c ? b : c;
		System.out.println(d +" is greater"); 
	}
}