import java.util.Scanner;

public class Student2
{
    //declare instance data
    private String name;
    private int grades1,grades2;
    Scanner s=new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student2(String studentName)
    {
        name=studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Please input "+name+"'s score for test1");
        grades1=s.nextInt();
        System.out.println("Please input "+name+"'s score for test2");
        grades2=s.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
        return (double) (grades1+grades2)/2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "name="+name+" test1="+grades1+" test2="+grades2;
    }

}