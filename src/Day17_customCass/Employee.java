package Day17_customCass;

public class Employee {
    public String name;
    public int age;
    public String gender;
    public String jobTitle;
    public double salary;
    public String id;

    public void setInfo(String name, int age, String gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){
        System.out.println(name + " is working");




    }
}