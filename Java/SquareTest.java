// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ***************************************·*************************

import java.util.Scanner;
import java.io.*;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {

Scanner scan = new Scanner(new File("D:\\Grade 11\\CSA\\data.txt"));

    int count = 1;                 //count which square we're on
    int size = scan.nextInt();     //size of next square

    //Expecting -1 at bottom of input file
    while (size != -1)
        {

        //create a new Square of the given size
        Square s1= new Square (size);

        //call its read method to read the values of the square
        s1.readSquare(scan);

        System.out.println("\n******** Square " + count + " ********");
        //print the square
        s1.printSquare();

        //print the sums of its rows
       for(int r=0;r<size;r++)
           System.out.println("The sum of the "+r+1+" row is "+s1.sumRow(r));

        //print the sums of its columns
        for(int c=0;c<size;c++)
            System.out.println("The sum of the "+c+1+" column is "+s1.sumCol(c));

        //print the sum of the main diagonal
          System.out.println("Main diagonal is " +s1.sumMainDiag());

        //print the sum of the other diagonal
        System.out.println("The other diagonal is " +s1.sumOtherDiag());

        //determine and print whether it is a magic square
        System.out.println(s1.magic());

        //get size of next square
        size = scan.nextInt();
       count++;
	    }

   }
}
