import java.util.Scanner;
public class swapArry {
    public static void main(String[]args){
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("How many value do you want to enter?");
        int length= s.nextInt();
        int arr[]= new int [length];
        System.out.println("Please enter the values");
        for (int i = 0;i<length;i++){
            arr[i]=s.nextInt();
        }
        for( int a= 0; a<arr.length-a; a++){
            temp= arr[length-a-1];
            arr[length-a-1]=arr[a];
            arr[a]=temp;
        }
        System.out.print("The inverse arry is ");
        for (int i=0;i<length;i++){
        System.out.print(arr[i]);}
    }
}