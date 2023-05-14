import java.util.Scanner;

public class band{
 public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     
     System.out.println("Please enter the first band booster's name");
     String name1=scan.nextLine();
     System.out.println("Please enter the second band booster's name");
     String name2=scan.nextLine();
     
     BandBooster first=new BandBooster(name1);
     BandBooster second=new BandBooster(name2);
     
     System.out.println("Please enter the numbers of boxes sold by "+ name1+" in these three weeks in order.");
     int newSale1=scan.nextInt();
     int newSale2=scan.nextInt();
     int newSale3=scan.nextInt();
     first
     
     System.out.println("Please enter the numbers of boxes sold by "+ name2+" in these three weeks in order.");
     int newSale2=scan.nextInt();
     
     first.updateSales(newSale1);
     second.updateSales(newSale2);
     
     System.out.println(first);
     System.out.println(second);
    }
}