import java.util.Scanner;

public class TestPalindrome{
    public static void main (String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter a word or a sentense.");
        Palindrome in1= new Palindrome(scan.nextLine());
        if (in1.getP())
            System.out.println("YES! The string you entered is a palindrome.");
        else
            System.out.println("NO! The string you entered is not a palindrome.");
    }
}