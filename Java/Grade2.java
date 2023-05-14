public class Grade2 {
    // instance variables?
    private String name;
    private int lowerBound;
    
    // Constructor to initialize the instance variables?
    public Grade2 (String letter, int cutOff){
        name = letter;
        lowerBound = cutOff;
    }
    // write a toString method to print the grades and the cutoff marks
    public String toString(){
        return name + " " + lowerBound;
    }
}