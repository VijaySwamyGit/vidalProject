package RSPracticeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPrograms {
	
	public void patternBasedReverse1()
	{
		String str = "My name is Vijay kumar";//o/p--ym name si vijay ramuk
		String arr[] = str.split(" ");
		String strRev="";
		int l = arr.length;
		System.out.println("l--> "+l);
		for(int i=0;i<l;i++)
		{
			if(i%2==0)
			{
				int ll = arr[i].length();
				System.out.println("ll--> "+ll);
				for(int j=ll-1;j>=0;j--)
				{
					strRev = strRev+arr[i].charAt(j);
				}
			}
			else
			{
				strRev = strRev+" "+arr[i];
				strRev = strRev+" ";
			}
		}
		
		System.out.println("--> "+strRev);
		
	}
	
	public void patternBasedReverse2()
	{
		String str = "My name is Vijay kumar";//o/p--ym kumar eman vijay si
		String arr[] = str.split(" ");
		String strRev="";
		int l = arr.length;
		System.out.println("l--> "+l);
		int hl=0;
		if(l%2==0)
		{
			hl=l/2;
		}
		else
		{
		hl =l/2+1;
		}
		for(int i=0;i<hl;i++)
		{
			
				int ll = arr[i].length();
				
				for(int j=ll-1;j>=0;j--)
				{
					strRev = strRev+arr[i].charAt(j);
					
				}
				strRev = strRev+ " ";
	
		}
		
	/*	for(int i=0;i<hl;i++)
		{
			
		}
		*/
		System.out.println("--> "+strRev);
		
	}
	
	//
	public void dupWord()
	{
	String[] users = "User1,User2,User1,User,User,User1".split(",");
	String[] temp = "User1,User2,User1,User,User,User1".split(",");
	List<String> l = Arrays.asList(temp);
	System.out.println("array to list"+l);
	Set<String> tempSet = new HashSet<String>(l);
	System.out.println("list to set -- "+tempSet);
	List sToalist = new ArrayList(tempSet);
	System.out.println("sToalist-- "+sToalist);
	//l.add("new");
	
	//String[] myArray = new String[tempSet.size()];
	//l.removeAll(sToalist);
	//System.out.println("array to list after reatin- "+l);
	
	//System.out.println(tempSet.size());
	//System.out.println(temp.length);
	//System.out.println(tempSet.toArray(myArray));
	//System.out.println(String.valueOf(myArray));
	//System.out.println(myArray[0]);
	
    Set<String> uniquUsers = new HashSet<String>();

    for (int i = 0; i < users.length; i++) {
        if (!uniquUsers.add(users[i]))
            users[i] = "Duplicate"; // here I am assigning Duplicate instead if find duplicate
                                    // you can assign as null or whatever you want to do with duplicates.
    }
    /*System.out.println(Arrays.toString(users));
    System.out.println(uniquUsers);
    System.out.println(tempSet.removeAll(uniquUsers));
    System.out.println(tempSet);
    System.out.println(uniquUsers);*/
	}
	//
	
	//
	public void dupWord2()
	{
		
			    int count=0;
			        String[] my_array = {"vijay", "shilpa", "ritvik", "kartik", "vijay", "swamy", "swamy","kodgi"};
			        int firstdup=0;
			        ArrayList al = new ArrayList();
			        ArrayList al2 = new ArrayList();
			        
			 
			        for (int i = 0; i < my_array.length-1; i++)
			        {
			        	if(!al.contains(my_array[i]))
			        	{
			        		al.add(my_array[i]);
			        	}else {
			        		al2.add(my_array[i]);
			        	}
			            for (int j = i+1; j < my_array.length; j++)
			            {
			                if( (my_array[i].equals(my_array[j])) )
			                {
			                    System.out.println("Duplicate Element is : "+my_array[j]);
			                    count++;
			                }
			            }
			        }
			        
			        System.out.println("unique values : "+al);
			        System.out.println("Duplicate Element is : "+al2);
			        System.out.println("count of duplicate values is "+al2.size());
			        System.out.println("first duplicate values is "+al2.get(firstdup));
			        
			}

	
	//
	
	//
	public void duplicateGeneric()
	{
					int secondDup=1;
			        String[] my_array = {"vijay", "shilpa", "ritvik", "kartik", "vijay", "swamy", "swamy","kodgi"};
			        String str = "vijayavi";

			        
			        ArrayList al1 = new ArrayList();
			        ArrayList al2 = new ArrayList();
			        
			        ArrayList al3 = new ArrayList();
			        ArrayList al4 = new ArrayList();

			        for (int i = 0; i < my_array.length-1; i++)
			        {
			        	if(!al1.contains(my_array[i]))
			        	{
			        		al1.add(my_array[i]);
			        	}else {
			        		al2.add(my_array[i]);
			        	}
			            
			        }
			        
			        for (int i = 0; i < str.length(); i++)
			        {
			        	if(!al3.contains(str.charAt(i)))
			        	{
			        		al3.add(str.charAt(i));
			        	}else {
			        		al4.add(str.charAt(i));
			        	}
			            
			        }
			        
			        System.out.println("Unique values : "+al1);
			        System.out.println("Duplicate Elements  : "+al2);
			        System.out.println("Count of duplicate values is "+al2.size());
			        
			        for(int j=0;j<al2.size();j++)
			        {
			        	System.out.println( "duplicate values are "+al2.get(j));
			        }
			        System.out.println("Second duplicate values is "+al2.get(secondDup));
			        
			        System.out.println("Unique values : "+al3);
			        System.out.println("Duplicate Elements  : "+al4);
			        System.out.println("Count of duplicate values is "+al4.size());
			        System.out.println("Second duplicate values is "+al4.get(secondDup));
			        
			}

	//
	
	//***********************************************
	
	public void vowelsNconsonants()
	{
		String str="vijayiov";
		int count=0;
		char ch [] = str.toCharArray();
		int l =str.length();
		System.out.println(l);
		System.out.println(ch.length);
		
		/*for (char c : ch) 
		{ 
			switch (c) 
		{ 
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
					count++; 
					//break; 
					//default: // no count increment }
		}*/
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
			
		}
			
	
		System.out.println("count of vowels in a given string is   "+count);
		System.out.println("count of consonants in a given string is   "+(l-count));
	}
	
	//*********************************************
	
	public void removingVowels()
	{
		   
		      String input = "Hi welcome to tutorialspoint";
		      String regex = "[aeiouAEIOU]";
		      String result = input.replaceAll(regex, "");
		      System.out.println("Result: "+result);
		   
		}
	//*******************************************
	
	public static void tricky()
	{
		System.out.println("static block");
	}
	//******************************************
	public void m()
	{
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}
	//***************************************

	public static void main(String[] args) {
		
		AllPrograms obj = new AllPrograms();
		//obj.patternBasedReverse2();
		//obj.dupWord();
		//obj.vowelsNconsonants();
		//obj.removingVowels();
		//obj.dupWord2();
		//obj.duplicateGeneric();
		//obj=null;
		//obj.tricky();
		obj.m();
		

	}

}
