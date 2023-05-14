// ****************************************************************
//   Grades2.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades2
{
    public static void main(String[] args)
    {
	Student student1 = new Student("Mary");
	Student student2 = new Student("Mike");
	//create student2, "Mike"
	
        
	//input grades for Mary
	student1.inputGrades();
	
	//print average for Mary
	//System.out.println("The average for "+student1.getName()+" is "+ student1.getAverage());
	System.out.println(student1);

	System.out.println();

	//input grades for Mike
	student2.inputGrades();
	//print average for Mike
	//System.out.println("The average for "+student2.getName()+" is "+ student2.getAverage());

	System.out.println(student2);


    }
}
