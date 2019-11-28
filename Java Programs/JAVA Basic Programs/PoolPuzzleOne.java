class PoolPuzzleOne
{
	public static void main(String[] args)
	{
		int x=0;
		while(x<4) 
		{
			if(x<1)
			{
				System.out.print("a");
			}
				System.out.print(" ");
			x=x+2;
			if(x<1)
			{
				System.out.print("noise");
				
			}
			x=x+1;
			if(x==1)
			{
				System.out.print("annoys");
			}
			x=x-1;
			//if(x)
			{
			
			}
			System.out.println("");
			x=x-1;
					
		}
	} 
}