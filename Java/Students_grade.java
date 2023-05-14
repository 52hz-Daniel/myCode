// *************************************************************** 
// Write a Java program that prints a table with a list of at
// least five students together with their grades 
//  earned (lab points, bonus points, and the total) in the format below.
// *************************************************************** 
public class Students_grade 
{ 
 // ------------------------ 
 // main prints the list 
 // ------------------------ 
 public static void main (String[] args) 
 { 
 int a1=43 ,b1=7 ,c1=a1+b1 ,a2=50 , b2=8, c2=a2+b2 , a3=39 , b3=10 , c3=a3+b3 , a4=34, b4=23, c4=a4+b4, a5=19, b5=2,c5=a5+b5;
 System.out.println ();
 System.out.println ("\t///////////////"  +  "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
 System.out.println ("\t==         Student Points      ==");
 System.out.println ("\t\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "//////////////////");
 System.out.println ("\n\tName\t\tLab\tBonus\tTotal");
 System.out.println ("\t----\t\t---\t-----\t-----");
 System.out.println ("\tDaniel\t\t"+a1+"\t"+b1+"\t"+c1);
 System.out.println ("\tRubin\t\t"+a2+"\t"+b2+"\t"+c2);
 System.out.println ("\tLinzy\t\t"+a3+"\t"+b3+"\t"+c3);
 System.out.println ("\tCoco\t\t"+a4+"\t"+b4+"\t"+c4);
 System.out.println ("\tAmy\t\t"+a5+"\t"+b5+"\t"+c5);
} 
}