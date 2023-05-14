import java.util.Scanner;
public class Age{
    public static void main (String args[]){
        
        final int MINOR=21;
        Scanner scan=new Scanner (System.in);
        System.out.println("enter");
        int age=scan.nextInt();
        if (age>= MINOR)System.out.println("You can.");
        
        else{
            System.out.println("Nope");
        }
    }}
        
