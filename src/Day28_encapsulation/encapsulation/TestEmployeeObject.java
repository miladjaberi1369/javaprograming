package Day28_encapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();

        employee1.setSalary(100000);
        System.out.println( employee1.getSalary());

        employee1.setName("Milad");
        System.out.println(employee1.getName());
        */
        Employee employee1 = new Employee("Khashayar", 30, "Developer", 100000);
        System.out.println(employee1);

    }
}
