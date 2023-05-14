// ******************************************************************* 
// PlusTestOne.java 
// 
// Demonstrate the different behaviors of the + operator 
// ******************************************************************* 
public class PlusTestOne 
{ 
 // ------------------------------------------------- 
 // main prints some expressions using the + operator 
 // ------------------------------------------------- 
 public static void main (String[] args) 
 { 
 String str; 
 str = "Alpharetta" + "Rocks!"; // be sure to fix “” marks 
 System.out.print(str); 
 str ="Countdown:" + 5 + 4 + 3 + 2 + 1 + 0; 
 System.out.print(str); 
 str = 1 + 2 + 3 + "Go!"; 
 System.out.print(str); 
 } 
}