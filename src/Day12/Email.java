package Day12;

public class Email {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";
        String firstNAme = email.substring(0, email.indexOf("_"));
        String lastName  = email.substring(email.indexOf("_") +1 , email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        System.out.println(firstNAme);
        System.out.println(lastName);
        System.out.println(rest);

        email = lastName + "_"+ firstNAme + rest;
        System.out.println(email);

    }
}


// assume that email address is constructed by persons first name and followed by an underscore and last name
// write a program that can swap first name with last name in the email (Sap rated by underscore );
// if the email dosent contain an underscore print the givin input email.
//          input : mike_tyson@gmail.com
//          output : tyson_mike@gamil.com
