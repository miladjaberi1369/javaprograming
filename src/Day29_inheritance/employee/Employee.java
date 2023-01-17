package Day29_inheritance.employee;

public class Employee {

    private String name;
    private char gender;
    private int age, id;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else {
            System.out.println("Invalid gender: " + gender);
            System.exit(1);
        }
    }
    public void setAge(int age) {
        if (age < 0){
            System.out.println("age can not be negative: " + age);
            System.exit(1);
        }
        if (age < 18 || age > 65){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.err.println("salary ca not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
