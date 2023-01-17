package Day17_customCass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("milad", 32, "M", "Owner", 200000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("dani", 32, "F", "Non", 0, "2323");

        Employee employee3 = new Employee();
        employee3.setInfo("nima", 40, "F", "dealer", 100, "69");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();
    }
}
