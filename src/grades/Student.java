package grades;
import java.util.*;

public class Student {

    //name stuff
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //grade stuff
    private List<Integer> grades;
    // grade instance methods


    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public int getGradeAverage(){
        int sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    // constructor
    public Student(String name){
    this.name = name;
    this.grades = new ArrayList<>();
}

}
