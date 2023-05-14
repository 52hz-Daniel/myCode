// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count2
{
  	public static void main (String[] args)
  	{

  	    
      	String phrase;    // a string of characters
      	int countBlank=0;   // the number of blanks in the phrase 
      	int length;       // the length of the phrase
      	char ch;          // an individual character in the string
      	int countA=0,countE=0,countS=0,countT=0;

      	
      	String stop="";
      

		Scanner scan = new Scanner(System.in);

      	// Print a program header
      	System.out.println ();
      	System.out.println ("Character Counter");
      	System.out.println ();
      	while(!stop.equals("quit")){

      	// Read in a string and find its length
      	System.out.print ("Enter a sentence or phrase: ");
      	phrase = scan.nextLine();
      	length = phrase.length();


      	
       for(int i=1;i<=length;i++){
      	ch = phrase.charAt(i);
  
      	switch (ch)
   {
      case 'a':
      case 'A':    
      countA++;
      break;

      case 'e': 
      case 'E':
      countE++;
      break;
      
      case 's': 
      case 'S':
      countS++;
      break;
      
      case 'T': 
      case 't':
      countT++;
      break;
      
      case ' ': 
      countBlank++;
      break;
      
   
   }
}
      	
      	// Print the results
      	System.out.println ();
      System.out.println ("Number of blank spaces: " + countBlank);
      System.out.println ();
      System.out.println ("Number of a: " + countA);
      System.out.println ();
      System.out.println ("Number of e: " + countE);
      System.out.println ();
      System.out.println ("Number of s: " + countS);
      System.out.println ();
      System.out.println ("Number of t: " + countT);
      System.out.println ();
      System.out.println("enter any phrase to continue and quit to quit ");
      stop = scan.next();
    	}
    }
}
