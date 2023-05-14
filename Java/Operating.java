import java.util.Scanner;
public class Operating{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 2 values");
        int x= scan.nextInt();
        int y= scan.nextInt();
        
        Operators cal= new Operators(x,y);
        
        System.out.println("What do you wanna do? Pess 1 for add, press 2 for sub, press"+
        " 3 for multiply and 4 for division");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
            System.out.println("The answer is "+cal.addition());
            break;
            case 2:
            System.out.println("The answer is "+cal.subtraction());
            break;
            case 3:
            System.out.println("The answer is "+cal.multiply());
            break;
            case 4:
            System.out.println("The answer is "+cal.division());
            break;
        }
    }
}