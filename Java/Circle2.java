import java.util.Scanner;
public class Circle2
{ 
    public static void main(String[] args) 
    { 
       final double PI = 3.14159; 
       int radius=0;  
       
       System.out.println("Please enter a value for the radius.");
       Scanner scan= new Scanner(System.in);
       radius=scan.nextInt();
       double area1 = PI * radius * radius , circumference1=PI*radius*2;
       System.out.println("The area of a circle with radius " + radius + 
                        " is " + area1);
       System.out.println("The circumference of a circle with radius "+radius+" is "+circumference1);
       
       radius = 2*radius; 
       double area2 = PI * radius * radius; 
       double circumference2=PI*radius*2;
       System.out.println("The area of a circle with radius " + radius + 
                        " is " + area2); 
       System.out.println("The circumference of a circle with radius "+radius+" is "+circumference2);
       
       /*double factorCir= circumference2/circumference1;
       double factorArea= area2/area1;
       System.out.println("The factor which the area grew is "+factorArea);
       System.out.println("The factor which the circumference grew is "+factorCir);*/
       
    } 
} 