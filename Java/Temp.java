import java.util.Scanner;

public class Temp{
public static void main(String args[]){
    int temp;
    
    Scanner scan=new Scanner (System.in);
    System.out.println("Please enter the temperature");
    temp=scan.nextInt();
    
    if(temp>=80&&temp<=95){
        System.out.println("swimming ");
    }
    else if(60<=temp&&temp<80){
        System.out.println("tennis  ");
    }
    else if(40<=temp&&temp<60){
        System.out.println("golf  ");
    }
    else if(temp>=20&&temp<40){
        System.out.println("skiing  ");
    }
    else{
        System.out.println("Visit our shops!  ");
    }
}
}