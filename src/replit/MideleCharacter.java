package replit;

public class MideleCharacter {
    public static void main(String[] args) {

        String word = "manma";
        String b = "manma";

        String middle = "";

        if (word.length() % 2 == 0){
           middle = word.substring((word.length()/2)-1, (word.length()/2)+1);
        }else {
           middle = "" + word.charAt(word.length()/2);
        }

        System.out.println(middle);
    }
}
