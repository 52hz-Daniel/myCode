public class BandBooster{
    private String name;
    private int boxesSold;
    
    public BandBooster(String nameIn){
        boxesSold=0;
        name= nameIn;
    }
    
    public String getName(){
        return name;
    }
    
    public void updateSales(int additional){
        boxesSold+= additional;
    }
    
    public String toString(){
     return name+": "+boxesSold+" boxes";
    }
}