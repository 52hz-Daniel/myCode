public class Shopping2 {
    public static void main(String[] args) {
        Cart c1=new Cart();
        c1.addToCart("milk", 5, 20);
        c1.addToCart("steak", 10, 50);
        System.out.println(c1);
    }
}