// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

	Item item;
	String itemName;
	double itemPrice;
	int quantity;
	double total=0;

 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";
	ArrayList<Item> cart= new ArrayList<Item>();

	do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.next();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

		// *** create a new item and add it to the cart
		
                item= new Item(itemName,itemPrice,quantity);
                cart.add(item);
                total+=item.getPrice()*item.getQuantity();


		// *** print the contents of the cart object using println
		
		//System.out.println(cart);
		int index=0;
		while(index<cart.size()){
		
                System.out.println(cart.get(index));
                index++;
            }

		System.out.print ("Continue shopping (y/n)? ");
		keepShopping = scan.next();
	    }
	while (keepShopping.equals("y"));
      System.out.print ("The total price is  "+ total);
    }
}
