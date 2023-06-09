//********************************************************************
//  StringMutation.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the String class and its methods.
//********************************************************************

public class StringMutation
{
    //-----------------------------------------------------------------
    //  Prints a string and various mutations of it.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        String phrase = "Change is inevitable"; // original string phrase
        String mutation1, mutation2, mutation3, mutation4;

        System.out.println("Original string: \"" + phrase + "\"");
        System.out.println("Length of string: " + phrase.length());
 // length of the string gives you the total number of characters in the string, including the spaces

        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3, 30); // it doest include the last position, but one less than the last

        // Print each mutated string
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);

        System.out.println("Mutated length: " + mutation4.length());
    }
}