public class CoinFlip1 {
    public static void main (String args[]){
        Coin1 myCoin = new Coin1 (); 
        myCoin.flip(); 
        System.out.println(myCoin);
        if (myCoin.isHeads()){
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Loose!");
        }
    }
}