package grades;

import java.util.*;
public class GradeAppl {


    public static Map<String, Student> createStudents(){
        Map<String,Student> students = new HashMap<>();

        Student lon = new Student("lon");
        lon.addGrade(95);
        lon.addGrade(90);
        lon.addGrade(89);
        Student joe = new Student("joe");
        joe.addGrade(45);
        joe.addGrade(45);
        joe.addGrade(45);
        Student bro = new Student("bro");
        bro.addGrade(99);
        bro.addGrade(99);
        bro.addGrade(99);
        Student sam = new Student("sam");
        sam.addGrade(67);
        sam.addGrade(5);
        sam.addGrade(9);

        students.put("lon123",lon);
        students.put("joedas",joe);
        students.put("bro23",bro);
        students.put("sam2",sam);

        return students;
    }
    public static void main(String[] args) {

        Map<String, Student> students = createStudents();

        System.out.println(students);



    }
}
