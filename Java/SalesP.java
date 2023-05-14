import java.util.Scanner;

public class SalesP{
    public static void main (String[] args){
Scanner scan = new Scanner (System.in);
System.out.println("how long is the array?");
int num= scan.nextInt();
int[] arr = new int [num];
int sum=0;

for(int i = 0; i<arr.length; i++){
System.out.println("Enter the total sales of person "+(i+1));
arr[i]= scan. nextInt();
sum= sum+ arr[i];
}
System.out.println("The total sales of the person is "+ sum);

System.out.println("The average sales of the person is "+ (double)sum/num);

int max = arr[0];
int min = arr[0];
int maxP= 0;
int minP= 0;

for (int i=0; i<arr.length;i++)
{
    if (arr[i] > max){
                max = arr[i];
                maxP = i+1;
                
            }
        
        
        }
        System.out.println("The maximum sales of "+max + " is by person "+maxP);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                minP = i+1;
                
            }
        
    }
    System.out.println("The minimum sales of "+min + " is by person "+minP);
    
    int[] Odd= new int
    for (i=0; i<arr.length;  i++)
    {
      if (arr[i]%2==1){
          
    }
}
 }
