import java.util.Scanner;
public class star{
public static void main (String arg[]){
    int num;
    int count=1;
    
    Scanner scan= new Scanner(System.in);
    System.out.println("How many line do you want to print?");
    num=scan.nextInt();
    
    for(int i=1;i<=num;i++){
        
        while(count<i){
        System.out.print("o ");
        count++;
       
    }
    System.out.print("/n");
}
}
}
    

