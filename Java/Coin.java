public class Coin {
    
    // data declarations, also called instance data (data applicable to objects of the Coin class)
    private final int HEADS = 0; 
    private final int TAILS = 1;
    private int face; // private means you cant access this data outside the class Coin directly
    
    // constructor - Constructors are always named same to the class name
    // they are used to help when you create objects of the Coin class
    Coin() { 
        flip(); // flip initially
    }
    // method of the Coin class
    public void flip(){ // when you flip the coin, it can get either 1 or 2 as the values
        face = (int)(Math.random() * 2); // face = either 1 or 2
    }
    public boolean isHeads(){ // boolean is the return type, it returns either True or False
        return (face == HEADS);
    }
    public String toString(){
        String faceName; // declare a string object here
        if (face == HEADS){
            faceName = "Heads";
        }
        else {
            faceName = "Tails";
        }
        return faceName;
    }
    
    
}