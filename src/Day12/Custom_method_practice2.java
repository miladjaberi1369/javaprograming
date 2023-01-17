package Day12;

public class Custom_method_practice2 {
    public static void main(String[] args) {
        initial("Milad", "Jaberi");
    }
    public static void initial(String first, String last){
        String initial = first.charAt(0) + "." + last.charAt(0);
        System.out.println("initial is: " + initial);
    }
}







//create method that can display the initials of person.      ( firstname . lastname)
