import java.util.Scanner;
public class pitchCount
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int[][]pitcharray={
                {45,105,67},
                {81,100,93,25,128,88},
                {45,53},
                {79,107,53,79},
                {11,9,3,63,20,18,3}};
        for(int i=0; i<5; i++){
            int min=2^32, max=0,tot=0;
            for (int p=0; p<pitcharray[i].length; p++){
                if (pitcharray[i][p]<min)
                    min=pitcharray[i][p];
                if (pitcharray[i][p]>max)
                    max=pitcharray[i][p];
                tot+=pitcharray[i][p];
            }
            System.out.println("pitcher "+(i+1)+" pitched "+pitcharray[i].length+" games, largest pitch "+max+", smallest "+min+", total "+tot+" average pitch count"+ (double)tot/pitcharray[i].length);
        }
        System.out.println("Which pitcher you want to print of:");
        int a=s.nextInt()-1;
        int min=2^32, max=0,tot=0;
        for (int p=0; p<pitcharray[a].length; p++){
            if (pitcharray[a][p]<min)
                min=pitcharray[a][p];
            if (pitcharray[a][p]>max)
                max=pitcharray[a][p];
            tot+=pitcharray[a][p];
        }
        System.out.println("pitcher "+(a+1)+" pitched "+pitcharray[a].length+" games, largest pitch "+max+", smallest "+min+", total "+tot+" average pitch count"+ (double)tot/pitcharray[a].length);
    }
}