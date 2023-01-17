package Day29_inheritance.encapsulation;

public class TestStudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Milad", 32, 'M', 'A', "MLT");
        System.out.println(student1);

        // if we want to change anything we have to do this
        student1.setSchoolName("Harvard");
        student1.setGrade('B');
        System.out.println(student1);
    }
}
