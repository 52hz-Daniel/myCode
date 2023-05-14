import java.util.Scanner;

public class Dog {
    private String name;
    private int age;
    Scanner s=new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Dog(String d)
    {
        name=d;
    }

    public void dogAge(int a)
    {
        age=a;
    }

    public double getHumanAge()
    {
        return age*7;
    }

    public String toString()
    {
        return "name="+name+" age="+age;
    }

}