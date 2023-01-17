package Day12;

public class Email_domain {
    public static void main(String[] args) {
        String emaile = "Cydeo@gmail.com";
        emailDomain(emaile);
    }
    public static void emailDomain(String email){

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(domain);
        System.out.println("domain: " + domain);
    }
}
