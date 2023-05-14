public class CoinFlip {
    public static void main (String args[]){
        Coin myCoin = new Coin (); // create the object for the Coin class to use its methods
        myCoin.flip(); // flip the coin
        System.out.println(myCoin);
        if (myCoin.isHeads()){
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Loose!");
        }
    }
}