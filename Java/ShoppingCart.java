public class ShoppingCart{
     private Item[] cart;
     private int capacity=0;
     private int itemCount=0;
     private double totalPrice=0;
     
     
     public ShoppingCart(){
         cart= new Item[10];
        }
    
     private void increaseSize(){
         capacity+=3;
            Item[] temp= new Item[capacity];
            for (int l= 0; l<cart.length; l++)
            temp[l]=cart[l];
            cart=temp;
        }
     public double getTotalPrice(){
         return totalPrice;
        }
     public void addToCart(String n,double p,int q){
         if (itemCount==cart.length)
         increaseSize();
         cart[itemCount]=new Item(n,p,q);
         itemCount++;
         totalPrice+=p*q;
        }
     public String toString(){
         String list="Shopping Cart\n";
         list+="Item\t"+"Unit Price\t"+"Quantity\t"+"Total\n";
         
         for (int i =0;i<itemCount;i++){
             list+= cart[i]+"\n";
            }
            return list;
        }
}