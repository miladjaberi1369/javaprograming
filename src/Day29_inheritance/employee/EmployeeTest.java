package Day29_inheritance.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setInfo("Milad", 'M', 32, 1234, "koni", 50000, "Java");
        System.out.println(developer2.getProgramingLanguage());
        System.out.println(developer2);

        Developer developer3 = new Developer();
        developer3.setInfo("Iman", 'M', 45, 69, "kose", 250000,"C#");
        System.out.println(developer3.coding());
    }
}
