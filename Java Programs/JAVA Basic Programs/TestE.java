class TestE
{
	public static void main(String [] args)
	{
		char ch='B';
		switch(ch)
		{
		case 'A': System.out.println("FCD");
			break;
		case 'B': System.out.println("FC");
			break;
		case 'C': System.out.println("SC");
			break;
		case 'D': System.out.println("Pass");
			break;
		case 'E': System.out.println("Fail");
			break;
		default : System.out.println("Invalid Grade");
		}
		
	}
}