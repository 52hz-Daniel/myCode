import java.util.Scanner;
public class Rectangle{
public static void main (String args[]){
    System.out.println("Please enter your height and width");
    Scanner scan=new Scanner(System.in);
    int height=scan.nextInt();
    int width=scan.nextInt();
    int perimeter=(width+height)*2;
    int area=width*height;
    System.out.println("the perimeter of this rectangle is "+perimeter+", and the area is "+area);
    
}}