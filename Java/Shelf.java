import java.util.Scanner;

public class Shelf {
    private String name;
    private int height, width, capacity, books;
    private boolean occupied=false;
    Scanner s=new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Shelf(String s)
    {
        name=s;
    }

    public void specs(int a, int b)
    {
        height=a;
        width=b;
        capacity=a*b;
    }

    public void isOccupied(boolean a)
    {
        occupied=a;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public boolean getStatus()
    {
        return occupied;
    }

    public String toString()
    {
        return "name="+name+" height="+height+" width="+width+" capacity="+capacity+" occupied="+occupied;
    }
}