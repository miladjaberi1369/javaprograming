package Day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students;

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }// takes one student object and adds to the arrayList of student

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name,int age, char gender, String id){
      //  Student student = new Student(name, age, gender,id);
        students.add(new Student(name, age, gender,id));
    }// takes, name, age, gender, id of student info, created student object by using given info, then adds the student object to the arrayList of student

    public void removeStudent(String id){
        students.removeIf( p -> p.id.equals(id));
    } // takes the id and then remove the student object with the specified id from arrayList of student

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
