import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
     final int COVERAGE=350;
     final int DOOR=20;
     final int WINDOW=15;
     int length,width,height;
     byte doorNumber,windowNumber;
     double totalSqFt,paintNeeded;
     
     Scanner scan= new Scanner(System.in);
     length=scan.nextInt();
     width=scan.nextInt();
     height=scan.nextInt();
     
     doorNumber=scan.nextByte();
     windowNumber=scan.nextByte();
     totalSqFt=height*width*length-windowNumber*WINDOW+DOOR*doorNumber;
     paintNeeded=totalSqFt/COVERAGE;
     System.out.println("length: "+length+" width: "+width+" height:"+height+" paintNeeded: "+paintNeeded);
     
    }
}