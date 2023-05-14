import java.util.Scanner;

public class Starsb
{
//----------------------------------------------------
//  Reads in a sequence of temperatures and finds the
//  maximum and minimum read in.
//----------------------------------------------------
public static void main (String[] args)
    	{
    	    final int ROWS=10;
    	    int row;
    	    int num;
    	    
    	    for (row=1; row<=ROWS;row++){
    	        for (num=row;num<ROWS;num++)
    	        System.out.print(" ");
    	        
    	        for (num=row;num>0;num--)
    	        System.out.print("*");
    	        System.out.println();
    	       }
    	   }
    }