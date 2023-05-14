 

import java.util.Scanner;
public class quizNew {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Please insert the number of questions: ");
        int[] k= new int[s.nextInt()];
        System.out.println("Please insert keys:");
        for (int i=0; i<k.length; i++){
            k[i]=s.nextInt();
        }
        do{
        int correct=0;
        System.out.println("Please insert answers:");
        for (int i=0; i< k.length; i++) {
            if (k[i]==s.nextInt())
                correct++;
        }

        System.out.println("Grade:"+correct+" percent correct: "+ (double)correct/k.length*100+ "%");
        System.out.println("Grade another quiz? Yes or No");
                s.nextLine();
        }while(s.nextLine().equals("Yes"));
    }
}