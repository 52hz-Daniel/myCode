// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************

import java.util.Scanner;

public class Square
{
    int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
      square=new int[size][size];
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sumR=0 ; 
       for (int c=0;c<square[row].length;c++){
         sumR+=square[row][c];
        }
        return sumR;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
     int sumC=0;
        for (int r=0;r<square.length;r++){
         sumC+=square[r][col];
        }
        return sumC;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sumDm=0;
       for (int d=0;d<square.length;d++){
         sumDm+=square[d][d];
        }
        return sumDm;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sumDo=0;
       for (int d=0;d<square.length;d++){
         sumDo+=square[d][square.length-1-d];
        }
        return sumDo;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
                 int temp=sumRow(0);
                 boolean a=true;
                 int i=1;
                 
       // for(int i=1 && a==true;i<square.length;i++){
           while(i<square.length&&a==true){
            int out=0;
            while(a==true&&out==0){
            if(temp!=sumRow(i))
            a=false;
            out++;
        }
        i++;
        }
        i=1;
        while(i<square.length&&a==true){
            int out=0;
            while(a==true&&out==0){
            if(temp!=sumCol(i))
            a=false;
            out++;
        }
        i++;
        }
        
         while(a==true){
        if(temp!=sumMainDiag())
            a=false;
        break;
    }
    while(a==true){
        if(temp!=sumOtherDiag())
            a=false;
        break;
    }
      return a;
}

    //--------------------------------------
    //read info into the square from the input stream associated with the 
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan){
        
      for (int row = 0; row < square.length; row++)
	  for (int col = 0; col < square.length; col ++)
	    square[row][col] = scan.nextInt();}
	   

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
       for (int row = 0; row < square.length; row++){
	  for (int col = 0; col < square.length; col ++)
	    System.out.print(square[row][col]+"\t");
	    System.out.println("");
	   }
    }

}
