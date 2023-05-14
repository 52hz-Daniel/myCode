// ****************************************************************
//   PowersOf2.java
//   Print out as many powers of 2 as the user requests
// ****************************************************************
import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {
        int num;    
        int counter=1;
        int factorial=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer");
        num=scan.nextInt();
      while(num<0){
          System.out.println("A nonnegative number is required. Please enter a nonnegative number. ");
          num=scan.nextInt();
        }
      if(num==0||num==1){
           System.out.println("The factorial is "+1);
           } 
            else{
                
        while (counter<num)
        {
             factorial=factorial*(counter+1);
             counter++;
        }
                
         System.out.println("The factorial is "+factorial);
              
             
            }
        }
    }
