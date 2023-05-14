public class ArrTest{
    public static void main (String[] args){
        final int LIMIT=15;
        final int MULTIPLE=10;
        
        int [] list = new int [LIMIT];
        for (int index=0;index< LIMIT; index++){
           list[index] = index* MULTIPLE;  
        }
        list [5]=999;
        
        for(int value:list){
            System.out.print(value+" ");
        }
        
    }}
    