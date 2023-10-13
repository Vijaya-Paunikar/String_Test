/*
 * This program takes a user-defined input and performs character shifting based on the following rules:
 * 1. All Upper Case letters are shifted left by 2 characters.
 * 2. All Lower Case letters are shifted left by 3 characters.
 */

package com.string;
// importing Scanner class for taking user input
import java.util.Scanner;

public class StringQue 
{

    public static void main(String[] args) 
    {
        // Create a Scanner object for user input.
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string.
        System.out.println("Enter a String:");
        
        // Read the user's input as a string.
        String input = sc.nextLine();
        
        // Create a StringBuilder to store the output string.
        StringBuilder output = new StringBuilder();
        
        // Iterate through each character in the input string.
        for (char character : input.toCharArray()) 
        {
            // Check if the character is an uppercase letter.
            if (Character.isUpperCase(character)) 
            {
                if (character == 'A') 
                {
                    // Special case for 'A' to wrap around to 'Y' when shifted left by 2.
                    output.append('Y');
                } 
                else 
                {
                    // Shift the character left by 2 positions and append it to the output.
                    output.append((char) (character - 2));
                }
            }
            // Check if the character is a lowercase letter.
            else if (Character.isLowerCase(character)) 
            {
                if (character == 'a') 
                {
                    // Special case for 'a' to wrap around to 'Z' when shifted left by 3.
                    output.append('Z');
                } 
                else if (character == 'b') 
                {
                    // Special case for 'b' to wrap around to 'Y' when shifted left by 3.
                    output.append('Y');
                } 
                else 
                {
                    // Shift the character left by 3 positions and append it to the output.
                    output.append((char) (character - 3));
                }
            }
            // If the character is neither uppercase nor lowercase, leave it unchanged and append it to the output.
            else 
            {
                output.append(character);
            }
        }
        
        // Print the final shifted output string.
        System.out.println("Output: " + output.toString());
    }
}
