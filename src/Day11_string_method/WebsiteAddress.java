package Day11_string_method;

public class WebsiteAddress {

    public static void main(String[] args) {
        String website = "www.google.com";
        if (website.startsWith("www.")){
            if (website.endsWith(".com") || website.endsWith("edu") || website.endsWith("gov")){
                System.out.println("valid");
            }
            }else {
            System.out.println("invalid");
        }
    }

}
