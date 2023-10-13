/*
Write a Program to take a user-defined input in which 
1.All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters
 */
package com.string;
import java.util.Scanner;
public class StringQue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String input=sc.nextLine();
		
		StringBuilder output=new StringBuilder();
		
		for(char character : input.toCharArray())
		{
			// if character is Uppercase then character is decremented by 2
			if(Character.isUpperCase(character))
			{
				output.append((char) (character-2));
			}
			// if character is Lowercase then character is decremented by 2
			else if(Character.isLowerCase(character))
			{
				output.append((char) (character-3));
			}
			else
			{
				output.append(character);
			}
			
		}
		System.out.println("Output: "+output.toString());
	}
}
