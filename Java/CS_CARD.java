import java.util.Scanner;
import java.text.NumberFormat;
public class CS_CARD{
public static void main (String args[]){
    double oldBalance,newBalance,additional,interest ;
    int minPayment=0;
    
    Scanner scan= new Scanner (System.in);
    System.out.println("Please enter your previous balance:");
    oldBalance=scan.nextDouble();
    System.out.println("Please enter your total amount of additional charges:");
    additional=scan.nextDouble();
    
    interest=0.02*(additional+oldBalance);
    newBalance=additional+oldBalance+interest;
    
    if(newBalance<50){
    minPayment =(int)newBalance ;}
    if(newBalance>=50&&newBalance<=300){
    minPayment =50;}
    if(newBalance>300){
    minPayment =(int)newBalance/5;}
    
    NumberFormat money = NumberFormat.getCurrencyInstance();
    System.out.println("\t\tCS CARD International Statement ");
    System.out.println("\t\t=============================== ");
    System.out.println("\n\t\tPrevious Balance:  \t"+money.format(oldBalance));
    System.out.println("\t\tAdditional Charges:\t"+money.format(additional));
    System.out.println("\t\tInterest: \t\t"+money.format(interest));
    System.out.println("\n\t\tNew Balance:  \t\t"+money.format(newBalance));
    System.out.println("\n\t\tMinimum Payment:   \t"+money.format(minPayment));
    
}
}