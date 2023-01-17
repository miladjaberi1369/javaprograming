package Day33_abstraction;

import java.time.LocalDate;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Daniel",'M', LocalDate.of(1989,11,1),"A1","Alumni Dev",2);
        System.out.println(cydeoStudent);

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();
    }
}
