import java.util.Scanner;
import java.util.Random;
public class haha
{
    public static void main(String[] args)
    {   
      String choice = "yes";
      
       while(choice.equalsIgnoreCase("yes"))
      {
        
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int highvalue=0,lowvalue=0;
        int count=0;
        Scanner scan = new Scanner(System.in);
        Random generator=new Random();
        numToGuess=generator.nextInt(10)+1;//randomly generate the  number to guess
        System.out.println("Please enter the guess number:");//print message asking user to enter a guess
        guess=scan.nextInt();//read in guess
        
                
         while (guess != numToGuess) 
       { 
           
           if(guess>numToGuess){
            System.out.println("Guess is wrong and too high");
            highvalue++;
          }
           else if(guess<numToGuess){
            System.out.println("Guess is wrong and too low"); 
            lowvalue++;
        }
         count++;
          guess=scan.nextInt();  //get another guess from the user
        
      }
        if(guess==numToGuess){
       count++;
       System.out.println("Guess is Right!");
       System.out.println("You used "+count+" times to get the correct number,includes "
       +highvalue+" high value of guess, " +lowvalue+" low value of guess"); //print message saying guess is righ
      } 
      System.out.println("Do you want another chance to guess? Yes for new chance and no for quit:");
       choice=scan.next();
   }
  }
}