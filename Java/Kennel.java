 

public class Kennel {
    public static void main(String[] args) {
        Dog dogA = new Dog("");
        dogA.dogAge(16);
        System.out.println("Equvalent human age for steven is: "+dogA.getHumanAge());
        System.out.println(dogA.toString());
    }
}
