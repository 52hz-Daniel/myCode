public class Cart {
    private String n;
    private int itemCount=0, capacity=10;
    private double totalPrice=0;
    private Items i[]=new Items[10];
    public Cart(){}

    public void addToCart(String name, int quantity, double price){
        if (itemCount==i.length)
        increaseSize();
        i[itemCount]= new Items(name, quantity, price);
        itemCount+=1;
        totalPrice+=quantity*price;
    }
    public void increaseSize(){
        Items c[]=new Items[i.length+3];
        for (int a=0; a<i.length; a++){ c[a]=i[a]; }
        i=c;
    }
    public String toString(){
        String s="Item\tUnit Price\tQuantity Total\n";
        for (int a=0; a<itemCount; a++) {
            s += i[a]+"\n";
        }
        return s;
    }
}