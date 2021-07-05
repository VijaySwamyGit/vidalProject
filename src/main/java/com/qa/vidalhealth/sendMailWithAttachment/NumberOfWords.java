package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Scanner;

public class NumberOfWords {



			public static void main(String[] args) {
				
				//Scanner is a class used to get the output from the user
				Scanner Kb=new Scanner(System.in);
				//Kb.ne
				//Input sentence from the user
				System.out.println("Enter a sentence!");
				//hasNext is a function of Scanner class which checks whether the next line is present or not 
				//if the line is present the code will continue to run 
				//but if the next line is not present the code will be terminated
				
				while(Kb.hasNext()){
					//nextLine is a function of Scanner class to read the input line
					String line=Kb.nextLine();
					// this string will contain the words that are split or we can say break by the split function
					//split function takes parameter i.e from where we have to split the string
					//here,that parameter is a space as soon as it will find a space,it will break that into substring from there
					//and store them in string array arr with an index 
					
					String[] arr=line.split(" ");
					//counter to count the number of words initialized to zero
					int word=0;
					//looping to count the number of words in array 
					for(int i=0;i<arr.length;i++){
						word++;
					} 
					//print the number of words in a sentence
					System.out.println(word);
				}
				
				
				//*****************
				String str = "i love my country india";
				String word[]=str.split(" ");
				
				//System.out.println("wordlength-1--"+word[2]);
				System.out.println("Number of words--"+word.length);//after spliting array size will give you number if words
				
			int wordc=0;
				//looping to count the number of words in array 
				for(int i=0;i<word.length;i++){
					wordc++;
				} 
				//print the number of words in a sentence
				System.out.println(wordc);
				//*******************
				
				
							
					}
				
			}
			
		
		


	

