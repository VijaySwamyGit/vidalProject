package RSPracticeExamples;

public class E2Open {

	
	public void m1()
	{
		Integer n1=100;
		Integer n2=100;
		Integer n3=500;
		Integer n4=500;
		
		if(n1==n2)
		{
			System.out.println("n1==n2");
		}
		else
		{
			System.out.println("n1!=n2");
		}
		
		if(n3==n4)
		{
		System.out.println("n3==n4");
		}
		else
		{
			System.out.println("n3!=n4");
		}
	}
	
	
	
	public void m2()
	{
		String str [] = {"best","of","luck"};
		
		System.out.println("--"+str.length);
		System.out.println("--"+str[0].length());//in question it was str[0].length but not str[0].length()
	}
	
	
	public void m3()
	{
		try
		{
			return;
		}
		finally
		{
			System.out.println("hello");
		}
	}
	
	/*public void m4()
	{
		//String str="";
		for(int count=1;count<=15;count++)
		{
		if(count%2==1?"***":"+++")
		{
			
		}
		}
	}*/
	
	
	
	
	
	public static void main(String[] args) {
		
		E2Open obj = new E2Open();
		obj.m3();
		

	}

}
