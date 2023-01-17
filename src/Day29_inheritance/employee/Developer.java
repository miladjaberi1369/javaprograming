package Day29_inheritance.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {

    private String ProgramingLanguage;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, String programingLanguage){
        setInfo(name, gender, age, id, jobTitle,salary);
        setProgramingLanguage(programingLanguage);
    }

    public String getProgramingLanguage() {
        return ProgramingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage){
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if (!list.contains(programingLanguage)){
            System.err.println("Invalid programing language : " + programingLanguage);
            System.exit(1);
        }
        this.ProgramingLanguage = programingLanguage;
    }
    public String coding(){
        //System.out.println(getJobTitle()+" "+getName()+ " is coding in "+ getProgramingLanguage());
        return getJobTitle()+" "+getName()+ " is coding in "+ getProgramingLanguage();
    }


    public String toString() {
        return   "Developer{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge()+
                ", id=" + getId()+
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "Developer{" +
                "ProgramingLanguage='" + ProgramingLanguage + '\'' +
                '}';
    }
}
