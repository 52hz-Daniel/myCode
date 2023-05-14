import java.util.Scanner;

public class Starsc
{
public static void main (String[] args)
    	{
    	    final int ROWS=10;
    	    int row;
    	    int num;
    	    
    	    for (row=1; row<=ROWS;row++){
    	        
    	        for (num=row;num>1;num--)
    	        System.out.print(" ");

    	        for (num=row;num<=ROWS;num++)
    	        System.out.print("*");
    	        
    	        System.out.println();
    	       }
    	   }
    }