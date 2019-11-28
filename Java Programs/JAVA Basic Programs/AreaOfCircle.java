class AreaOfCircle
{
	public static void main(String [] args)
	{
		double res = area(7);
		System.out.println("The area of circle is "+res);
		
		double cir = circum(7);
		System.out.println("The Circumference of circle is "+cir);

	}

	static double area(int radius)
	{
		double ar= 3.14*radius*radius;
		return ar;
	}

	static double circum(int radius)
	{
		double cr= 2*3.14*radius;
		return cr;
	}
}