package Day12;

public class capitalization {
    public static void main(String[] args) {
    String firstName = "cyDeO";
    String lastName = "sCHooL";
    capitalization(firstName, lastName);


    }
public static void capitalization(String name , String lastName){
      String firstname = name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
      lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
    System.out.println("full name: " +  name + " " + lastName);

}
}

//2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
//        Ex:
//        capitalization("cyDeO", "sCHooL")
//
//        output:
//        full name: Cydeo School
