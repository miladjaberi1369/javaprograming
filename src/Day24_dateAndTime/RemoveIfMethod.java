package Day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();

        name.addAll(Arrays.asList("Java", "Python", "C#", "Java", "Ruby"));

        name.removeIf( P -> P.startsWith("J") );
        System.out.println(name);

    }
}
