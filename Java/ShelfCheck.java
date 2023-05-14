public class ShelfCheck {
    public static void main(String[] args) {
        Shelf shelf1 = new Shelf("shelf1");
        shelf1.specs(5,6);
        shelf1.isOccupied(true);
        System.out.println("The capacity of the shelf is:"+shelf1.getCapacity());
        System.out.println("The shelf is occupied:"+shelf1.getStatus());
        System.out.println(shelf1);
    }
}