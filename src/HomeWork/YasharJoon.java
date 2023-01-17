package HomeWork;

public class YasharJoon {
    public static void main(String[] args) {
        char ascending = 'A';
        char descending = 'Z';


        for (char i = 'A'; i <= 'Z'; i++) {
            ascending += i;
        }
        for (char j = 'z'; j >= 'a'; j--) {
            descending += j;
        }

        System.out.println(ascending);
        System.out.println(descending);

    }
}
