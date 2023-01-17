package day13;

public class ageGroup {
    public static void main(String[] args) {
      ageGroup(75);
    }
    public static void ageGroup(int age){
       if (age >=0 && age <= 150){
           System.out.println(  (age < 21)? "Teenager"  : (age < 55 ) ? "Adult" : "Senior");

       }else {
           System.err.println("Invalid age: " + age);
       }
    }


}






//create a method named ageGroup that can print age of the person
//          age groups are:
//          teenager (<21)
//           adult  (>=21 && <55)
//           senior (>55 )