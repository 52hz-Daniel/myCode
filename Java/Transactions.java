public class Transactions {
    public static void main (String args []){
        // create the object of the Account class
        Account acc1 = new Account (456.4, "Johnson", 7488484);
        Account acc2 = new Account (9.9, "Tony", 363553);
        Account acc3 = new Account (783663.65, "Raffy", 47747747);
        
        acc1.deposit(45.9);
        System.out.println(acc2.deposit(65.34));
        acc3.withdraw(7.8, 1.5);
        acc1.addInterest();
        acc2.addInterest();
        acc3.addInterest();
        System.out.println();
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}