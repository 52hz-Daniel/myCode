public class Items {
    private String n;
    private int q;
    private double p;
    public Items(String name, int quantity, double price){
        n=name;
        q=quantity;
        p=price;
    }
    public String getName(){ return n; }
    public int getQuantity(){ return q; }
    public double getPrice(){ return p; }
    public String toString(){ return n+"\t"+p+"\t\t"+q+"\t\t "+p*q; }
}