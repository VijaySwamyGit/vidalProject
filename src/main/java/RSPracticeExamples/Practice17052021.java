package RSPracticeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;

public class Practice17052021 {
	
	public void dupInArray()
	{
		int [] arr =new int [] {1,2,2,3,3,3,4,};
		ArrayList<Integer> al= new ArrayList<Integer>();
		
	
		for(int i=0;i<arr.length;i++)
		{
			int dup=0;
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
				dup++;
			
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					dup++;
				}
			}
			
			System.out.println("-- "+arr[i]+" "+dup);
		}
			
	}
		System.out.println("-- "+al);
	}
	
	//***************************************
	
	public void DupInstring()
	{
		String str = "india is my country";
		char ch [] = str.toCharArray();
		ArrayList al= new ArrayList();
		
		for(int i=0;i<ch.length;i++)
		{
			int dup=0;
			if(!al.contains(ch[i]))
			{
				al.add(ch[i]);
				dup++;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						dup++;
					}
					
				}
				
				if(dup>1)
				{
					System.out.println("--> "+ch[i]+"--"+dup);
				}
				
				//System.out.println("--> "+ch[i]+"--"+dup);
			}
			
		}
		System.out.println("--> "+al);
	}
	
	//**************************************************
	public void DupInStringUsingHashMap()
	{
		String str = "india is my country";
		char ch [] = str.toCharArray();
		
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		
		for(char alpha:ch)
		{
			if(hp.containsKey(alpha))
			{
				int count = hp.get(alpha);
				count++;
				hp.put(alpha, count);
			}else
			{
				hp.put(alpha, 1);
			}
		}
		
		Set<Character> keys = hp.keySet();
		
		for(char alphabet:keys)
		{
			if(hp.get(alphabet) > 1)
			{
				System.out.println(alphabet+" is "+hp.get(alphabet)+" times");
			}
		}
	}
	
	//***************************************************
	public void DupInArrayUsingHashMap()
	{
		int arr [] = new int [] {1,2,2,3,3,3};
		HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		
		for(int i:arr)
		{
			if(hp.containsKey(i))
			{
				int count = (Integer) hp.get(i);
				count++;
				hp.put(i, count);
			}else
			{
				hp.put(i, 1);
			}
		}
		System.out.println(hp);
		Set<Integer> keys = hp.keySet();
		
		for(int num:keys)
		{
			if(hp.get(num) > 1)
			{
				System.out.println(num+" is "+hp.get(num)+" times");
			}
		}
		
	}

//***************************************************
	public void ReverseStringRetainingPositionOfSpaces()
	{
		String str = "I Am Not a String";
		char ch [] = str.toCharArray();
		int ll = ch.length;
		char result[]=new char[ll];
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				result[i]=' ';
			}
		}
		
		
		int rll=result.length;
		rll=rll-1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				if(result[rll]==' ')
				{
					rll--;
				}
				
				
			
			result[rll]=ch[i];
			rll--;
				
			}
		}
		
		System.out.println("ReverseStringRetainingPositionOfSpaces--> is "+ String.valueOf(result));
	}
	//**************************************************************
	public void p1()
	{
		//int i=0;
		//int j=0;
		int size=5;
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if((i+j>size))
				{
					System.out.print("*");
					System.out.print(" ");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	
	
	//******************************************************************
	public void p2()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
	//********************************************************************
	
	public void p3()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("1");
			}
			System.out.println(" ");
			
		}
		
		
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("1");
			}
			System.out.println(" ");
			
		}
	}
	//******************************************************************	
	public void p4()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j%2==0)
				System.out.print("@");
				else
				System.out.print("#");
			}
			System.out.println(" ");
			
		}
	}
	
	//*************************************************************
	public void lengthOfStringWithoutLengthFunction()
	{
		String str = "Automation";
		char ch [] = str.toCharArray();
		int count=0;
		for(char c: ch)
			
		{
			count++;
		}
		
		System.out.println(count);
	}
	//****************************************************
	

	
	public void regex()
	{
	System.out.println(Pattern.matches("[my name is vijay]+", "vijay"));//true 
	System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
	System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
	}
	
	
	//************************************************************
	public static void reverseString(){  
	    StringBuilder sb=new StringBuilder("vijay");  
	    String str = sb.reverse().toString();  
	    System.out.println(str);  
	    StringBuffer sbb=new StringBuffer("vijay");
	    sbb.reverse();  
	    System.out.println(sb.toString());  
	    //System.out.println(StringFormatter.reverseString("my name is khan")); 
	}  
	//***************************************************************
	public static void capitalizeWord(){  
		String str="my name is vijay";
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord=capitalizeWord+first.toUpperCase()+afterfirst+" ";  
	       
	    }  
	    System.out.println(capitalizeWord);
	}
	    //return capitalizeWord.trim();  
	
	//*********************************************************************
	public static void toggleEachWord(){  
		String str="My Name Is vijay";
	    String words[]=str.split("\\s");  
	    String toggelWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggelWord=toggelWord+first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	       
	    }  
	    System.out.println(toggelWord);
	}
	//********************************************************************
	 
	    static void isAnagram() {  
	    	String str1="woman hitler";
	    	String str2="mother in law";
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	//**********************************************************

	public static void main(String[] args) {
		Practice17052021 obj = new Practice17052021();
		//obj.dupInArray();
		//obj.DupInstring();
		//obj.DupInStringUsingHashMap();
		//obj.DupInArrayUsingHashMap();
		//obj.ReverseStringRetainingPositionOfSpaces();
		//obj.p1();
		//obj.p3();
		//obj.lengthOfStringWithoutLengthFunction();
		//obj.regex();
		//obj.reverseString();
		//obj.capitalizeWord();
		//obj.toggleEachWord();
		obj.isAnagram();
		

	}

	}


