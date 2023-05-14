import java.util.Scanner;

public class Starsd
{
public static void main (String[] args)
    	{
    	    final int ROWS=5;
    	    int row;
    	    int num;
    	    
    	    for (row=1; row<=ROWS;row++){
    	        
    	        for (num=row;num<=ROWS;num++)
    	        System.out.print(" ");

    	        for (num=1;num<(row*2);num++)
    	        System.out.print("*");
    	        
    	        for (num=row;num<=ROWS;num++)
    	        System.out.print(" ");
    	        
    	        System.out.println();
    	       }
    	    for (row=1; row<=ROWS;row++){
    	        
    	        for (num=row;num>0;num--)
    	        System.out.print(" ");

    	        for (num=1;num<=((ROWS-row)*2+1);num++)
    	        System.out.print("*");
    	        
    	        for (num=row;num>0;num--)
    	        System.out.print(" ");
    	        
    	        System.out.println();
    	       }
    	   }
    }