import java.util.Scanner;

public class QuizRun{
   public static void main (String[] args){
       Scanner scan= new Scanner (System.in);
       
       System.out.println("How many questions are in the quiz?");
       ArrQuiz quiz1= new ArrQuiz(scan.nextInt());
        int key;
       System.out.println("Please enter the correct answers one by one");
       for (int i=0; i<quiz1.getLength(); i++){
           
          key = scan.nextInt();
       quiz1.getKey(key,i);
    }
    
      System.out.println("Please enter the answers for the quiz to be graded");
       for (int i=0; i<quiz1.getLength(); i++){
           int ans=scan.nextInt();
       quiz1.compare(ans,i);
    }
       
    System.out.println(quiz1);
    
    }
     
    
}
