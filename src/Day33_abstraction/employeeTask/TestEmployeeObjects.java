package Day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

     //   Employee employee = new Employee("Daniel",54,'M',"A1","SDET",85000);
        // we can not create objects from an abstract class, object must be created from a concreted class

        Teacher teacher = new Teacher("James", 45,'M',"B1","Math teacher",75000);

        Developer developer = new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        Driver driver = new Driver("Milad",31,'M',"D2","Truck Driver",10000);

        Tester tester = new Tester("Emily", 35,'F',"E1","Manual Tester", 80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        teacher.work();
        developer.work();
        driver.work();
        tester.work();
    }
}
