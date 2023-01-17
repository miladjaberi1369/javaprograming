package Day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        person[] people = {new person(), new person(), new person(),new person(), new person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Nima", 'M', LocalDate.of(1979,5,15));
        people[2].setInfo("Iman", 'M', LocalDate.of(1959,10,25));
        people[3].setInfo("Maya", 'F', LocalDate.of(2021,9,8));
        people[4].setInfo("Danielle", 'F', LocalDate.of(1990,8,3));


        ArrayList<person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));






// print the name & date of birth of each person object
// remove the person object that has the age > 55


    }
}
