// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
    private int score1=0;
    private int score2=0;
    private String name;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    Scanner scan = new Scanner (System.in);
    
    
    public Student(String student)
    {
	name= student;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
	
        System.out.println("enter "+ name+ "'s first test grade");
	score1=scan.nextInt();
	System.out.println("enter "+ name+ "'s second test grade");
	score2=scan.nextInt();
	
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()//add header for getAverage
    {
	double average= (score1+score2)/2;
	return average;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName()
    //add header for printName
    {
	return name;
    }

    public String toString()
    {
        return"Name:  "+ name+ "  Test1:  "+score1+"  Test2:  "+score2;
    }

}
;