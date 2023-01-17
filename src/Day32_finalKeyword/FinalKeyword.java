package Day32_finalKeyword;

import java.time.LocalDate;

public class FinalKeyword {
    public static void main(String[] args) {

       final char gender = 'M';
        System.out.println(gender); // M

     //   gender = 'F';
        System.out.println(gender); // F

        System.out.println("--------------------------------------");

       final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);
    }
}
