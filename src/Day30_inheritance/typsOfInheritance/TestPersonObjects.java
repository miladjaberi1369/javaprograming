package Day30_inheritance.typsOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student("Milad", 'M',LocalDate.of(1991, 01,30),'A', "A01" );

        President president = new President("Daniel", 'M',LocalDate.of(1980,12,1),LocalDate.of(2020,1,1) );

        Teacher teacher = new Teacher("Emily", 'F',LocalDate.of(1985,11,1),"C30","Math teacher", 95000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();


    }
}
