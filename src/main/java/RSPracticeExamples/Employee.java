package RSPracticeExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee
{
	
	String name="";
	int age=0;
	String address="";
	
	public Employee(String name, int age, String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	
	
	public static void main(String [] args)
	{
		
		HashMap<Integer, Employee> hp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("vijay", 39,"#379 sm heritage");
		Employee e2 = new Employee("vijay2", 39,"#379 sm heritage2");
		hp.put(1, e1);
		hp.put(2, e2);
		
		System.out.println(hp);
		
		Set entry = hp.entrySet();
	   Iterator itr = entry.iterator();
	   while(itr.hasNext())
	   {
		  Map.Entry mp =(Map.Entry)itr.next();
		  
			System.out.println(mp.getKey()+"--"+mp.getValue());
			System.out.println(mp.getKey()+"--"+mp.getValue());
			//Employee ee = mp.getValue();
			
	   }
		
		
	}
}

