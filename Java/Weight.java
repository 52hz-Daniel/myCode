import java.util.Scanner;
public class Weight{
    public static void main(String[] args){
    
      int heightFeet,heightInch;
      int femaleAdd;
      int femaleWeight;
      int maleAdd;
      int maleWeight;
      
      System.out.println("Enter the Height in feet.");
      Scanner scan= new Scanner(System.in);
      heightFeet=scan.nextInt();
      System.out.println("Enter the Height in inch.");
      heightInch=scan.nextInt();
      femaleAdd=(heightFeet-5)*12+heightInch;
      maleAdd=(heightFeet-5)*12+heightInch;
      femaleWeight=femaleAdd*5+100;
      maleWeight=maleAdd*6+106;

      double maleRangeUp=maleWeight+maleWeight*0.15;
      double femaleRangeUp=femaleWeight+femaleWeight*0.15;
      double maleRangeDown=maleWeight-maleWeight*0.15;
      double femaleRangeDown=femaleWeight-femaleWeight*0.15;
      
      System.out.println("The ideal male weight for you is "+maleWeight);
      System.out.println("The range is between "+maleRangeDown+" to "+maleRangeUp);
      System.out.println("The ideal female weight for you is "+femaleWeight);
      System.out.println("The range is between "+femaleRangeDown+" to "+femaleRangeUp);
    }
    
    
    
}