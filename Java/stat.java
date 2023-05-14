public class stat{
 public static void main (String args[]){
     int x1=0;
     for (int i = 0; i<100;i++){
         for (int n=0;n<12;n++){
             
         x1+= (int)(Math.random()*19100)+6000;
        }
        System.out.println(x1);
        x1=0;
        }
    }
}