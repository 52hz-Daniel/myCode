// ****************************************************************
//   LoveCS.java
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
	//	final int LIMIT = 10;
	        int limit;
		int count = 1;
		int sum=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter how many sentences you want to print");
		limit= scan.nextInt();
		while (count <= limit)
{
                        
	    		System.out.println(count+ " I love Computer Science!!");
	    		sum+=count;
	    		count++;
	    		
		}
		System.out.println("Printed this message "+(count-1)+" times. The sum of the numbers from 1 to "+(count-1)+" is   "+sum);
    }
}
