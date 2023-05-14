public class GradeRange{
    public static void main (String args[]){
        // create an array (initializer list) of objects of the Grade class
        Grade2 [] grades = {new Grade2("A", 90), new Grade2("B", 80), new Grade2("C", 70), new Grade2("D", 60)};
        
        // print out a table for the grades and their corresponding cutoff marks
        for (Grade2 letterGrade: grades){
            System.out.println(letterGrade);
        }
    }
}