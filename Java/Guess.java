import java.util.Scanner;
import java.util.Random;

public class Guess
{
public static void main(String[] args)
{
while (true)
{
     {
       int numToGuess, guess, high=0, low=0, sentinel;            
  Scanner s = new Scanner(System.in); 
  Random r= new Random();
  numToGuess=r.nextInt(100)+1;
  do 
       {
   System.out.println("Please guess a number:");
   guess=s.nextInt();
   if(guess>numToGuess)
   {
    System.out.println("Too high");
    high++;
   }
   else if(guess<numToGuess)
   {
    System.out.println("Too low");
    low++;
   }
  }while(guess!=numToGuess);
  System.out.println("Congrats, you guessed "+high+" times too high, and "+low+" times too low");
  System.out.println("Play again?(Insert 1 to continue)");
  sentinel=s.nextInt();
  if (sentinel!=1)
   System.exit(0);
     }
    }
}
}