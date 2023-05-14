import java.util.Scanner;

public class TestNames{
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the first, middle, and last name of the first name in order");
       String firstNew1= scan.nextLine();
       String middleNew1= scan.nextLine();
       String lastNew1= scan.nextLine();
     System.out.println("enter the first, middle, and last name of the second name in order");
       String firstNew2= scan.nextLine();
       String middleNew2= scan.nextLine();
       String lastNew2= scan.nextLine();
     Names2 nameNew1=new Names2 (firstNew1,middleNew1,lastNew1);
     Names2 nameNew2=new Names2 (firstNew2,middleNew2,lastNew2);
     
     System.out.println("The first name in first-middle-last version is "+ nameNew1.firstMiddleLast());
     System.out.println("The first name in last-first-middle version is "+ nameNew1.lastFirstMiddle());
     System.out.println("The initials of the first name is "+ nameNew1.initials());
     System.out.println("The length of the first name is "+ nameNew1.length()); 
     
     System.out.println("The second name in first-middle-last version is "+ nameNew2.firstMiddleLast());
     System.out.println("The second name in last-first-middle version is "+ nameNew2.lastFirstMiddle());
     System.out.println("The initials of the second name is "+ nameNew2.initials());
     System.out.println("The length of the second name is "+ nameNew2.length());
     
     
     if(nameNew1.equals(nameNew2)){
        System.out.println("The two words are the same." );
        }
       else{
        System.out.println("The two words are different." );
    }
    }
    
}