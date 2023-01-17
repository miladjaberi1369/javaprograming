package Day30_inheritance.typsOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends Person{

    private char grade;
    private String studentId;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade);
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentIc) {
        this.studentId = studentIc;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }
}
