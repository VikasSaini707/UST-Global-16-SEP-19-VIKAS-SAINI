class BMI
{
	public static void main(String [] args)
	{
		int weight = 74;
		double height = 1.554;
		double BMI = (weight)/(height*height);
		if(BMI>=40)
		{		
			System.out.println("You are too over weight");
		}
		else if(BMI>=30 && BMI<=39.9)
		{
			System.out.println("You are in Obese range");
		}
		else if(BMI>=25)
		{
			System.out.println("You are in Overweight range");
		}
		else if(BMI>=18.5)
		{
			System.out.println("You are in Healthy weight range");
		}
		else if(BMI<18.5)
		{
			System.out.println("You are in Underweight range");
		}


	}
}