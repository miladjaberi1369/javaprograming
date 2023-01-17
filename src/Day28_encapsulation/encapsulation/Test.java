package Day28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(28);


        System.out.println(student.getAge());

        student.setName("Aaron");
        System.out.println(student.getName());
    }
}
