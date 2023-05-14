import java.util.Scanner;
public class Shopping{
  public static void main (String[] args){
      String nameIn;
      double priceIn;
      int quanIn;
     Scanner scan= new Scanner(System.in);
     ShoppingCart cart= new ShoppingCart();
   //Cart cart= new Cart();
         while (true){
     
     System.out.println("Please enter the name of the item. Or enter quit to quit");
     nameIn= scan.next();
     if (nameIn.equals("quit"))
     break;
     
     System.out.println("Please enter the price of the item.");
     priceIn= scan.nextDouble();
     System.out.println("How many of it do you want");
     quanIn= scan.nextInt();
     
    // cart.addToCart(nameIn,quanIn,priceIn);
     cart.addToCart(nameIn,priceIn,quanIn);

     System.out.println("total price of the cart is "+cart.getTotalPrice());
     //System.out.println("Add another item? enter yes or no.");
     
    }
         System.out.println(cart);
   System.out.println("Please pay "+ cart.getTotalPrice());
    //scan.next().equalsIgnoreCase("yes"
    }
}