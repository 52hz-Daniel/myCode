public class Grades3
{
    public static void main(String[] args)
    {
        Student2 student1 = new Student2("Mary");
        Student2 student2 = new Student2("Mike");
        //create student2, "Mike"

        //input grades for Mary
        student1.inputGrades();
        //print average for Mary
        System.out.println(student1.getName()+"'s average score is "+student1.getAverage());
        System.out.println();

        //input grades for Mike
        student2.inputGrades();
        //print average for Mike
        System.out.println(student2.getName()+"'s average score is "+student2.getAverage());
    }
}