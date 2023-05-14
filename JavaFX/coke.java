package AdvanceCS;
import java.util.Scanner;
public class coke {
    int change= 0;

    public static void main(String args[]) {
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Have a coke! The price of one coke is 125cents");
            System.out.println("Insert coin: ");
            int num =0;
            int total = 0;

            while (total <= 125) {
                num = scan.nextInt();
                if (!(num == 5 || num == 10 || num == 25 || num == 100)) {
                    System.out.println("Rejecting coin" + num);
                    System.out.println("Insert coin: ");
                    num = scan.nextInt();

                }
                total += num;
                System.out.println("Amount entered" + total);
                System.out.println("Insert coin: ");


            }
            System.out.println("Amount entered" + total);
            System.out.println("Please make your selection:");
            System.out.println("1.  coke");
            System.out.println("2.  coke zero");
            System.out.println("3.  CFDC");
            System.out.println("Your choice:");
            int choice = scan.nextInt();
            int change = total - 125;
            if (choice == 1) {
                System.out.println("Dispensing coke");


            } else if (choice == 2) {
                System.out.println("Dispensing CZ");


            } else if (choice == 3) {
                System.out.println("Dispensing CFDC");

            } else {
                System.out.println("No such beverage, choose another");
                choice = scan.nextInt();
            }

            total-=125;
            int a=total/25;
            int b= (total-a*25)/10;
            int c= ((total-a*25)-b*10)/5;

            if (a>=1){
                for (int i= 0; i<a; i++)
                System.out.println("Return a quater");
            }
            if (b>=1){
                for (int i= 0; i<b; i++)
                    System.out.println("Return a dime");
            }
            if (c>=1){
                for (int i= 0; i<c; i++)
                    System.out.println("Return a nickle");
            }

        }
    }
}

