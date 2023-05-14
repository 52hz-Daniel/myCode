public class Item{
    
    private int quan;
    private String name;
    private double price;
    
  public Item(String n,double p,int q){
      quan=q;
    name=n;
   price=p;
    }
    
    public String getName(){
     return name;   
    }
     public double getPrice(){
     return price;   
    } 
    public int getQuantity(){
     return quan;   
    }
    public String toString(){
     return name+"\t"+price+"\t\t"+quan+"\t\t"+quan*price;  
    }
}