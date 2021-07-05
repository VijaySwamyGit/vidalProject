package RSPracticeExamples;

public class Patterns {
	
	
	public void p1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	//*************************************************************************************************
	public void p2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p3()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p4()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p5()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p6()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%3d",i*j);
							}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p7()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%3d",k);
				k+=1;
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p8()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%3d",k);
				k+=2;
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p9()
	{
		int k=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%3d",k);
				k+=2;
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	public void p10()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%3d",x);
				x=x+n;
				
			}
			
			System.out.println();
		}
	}
	//************************************************************************************************
	//************************************************************************************************
	
	
	
	
	
	
	public static void main(String[] args) {
		Patterns obj = new Patterns();
		obj.p10();
		
	}

}
