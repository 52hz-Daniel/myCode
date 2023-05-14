import java.util.Scanner;

public class ArrQuiz{
   
    int correct=0;
    int num;
    
    Scanner scan= new Scanner(System.in);
       int[] key;
   public ArrQuiz(int numIn){
       num= numIn;
       key= new int [num];
    }
   
    public int getLength(){
       return key.length;    
    }
    
    public void getKey(int numIn,int i){
        
            key[i]= numIn;
        
     
    }
    
    public void compare(int answer,int i){
           if (key[i]== answer)
           correct++;
    }
    
    public String toString(){
       return "Number correct: "+correct+"   percent correct: "+ (double)correct/num*100+ "%";
      
    }
    
    
}