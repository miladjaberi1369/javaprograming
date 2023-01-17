package Day11_string_method;

public class EmailTask2 {
    public static void main(String[] args) {


        String email = "milad_jaberi@aplle.com";
        int underline = email.indexOf("_");  //getting the index of underline
       String first_name = email.substring(0,underline); //makeing the first name with indexes that we have
       char first_name_first_letter = email.charAt(0); //getting the first char of the name
       first_name_first_letter = Character.toUpperCase(first_name_first_letter); //make the first chat to uppercase
       first_name = first_name_first_letter + first_name.substring(1); //using the capital first char + firstname (starting from index
        //1 becasue we used the char and we want to get rid of the lowercase since we used the upper case char value

        int at = email.indexOf("@");
        String last_name = email.substring(underline +1,at);
        last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1);


        int dot = email.indexOf(".");
        String domain = email.substring(at +1 , dot);
        domain=domain.substring(0,1).toUpperCase() + domain.substring(1);


        System.out.println("First name: " + first_name);
        System.out.println("Last name: " + last_name);
        System.out.println("Domain: " + domain);



    }
}
//9. Create a class called EmailTask2.
//        Assume that email address is constructed by person's first name and followed by an underscore and last name.
//
//        Write a program that will print out information about user based on email. Print first name, last name, and domain.
//
//        First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//        Ex:
//        input:
//        craig_federighi@apple.com
//
//            Output:
//                    First name: Craig
//                    Last name: Federighi
//                    Domain: apple
