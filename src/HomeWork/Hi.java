package HomeWork;
/*
abc hi how
hihi bye
   */
public class Hi {
    public static void main(String[] args) {

        String a = "abc hi how";


        int tracker = 0;

        for (int i = 0; i < a.length()-1; i++) {
            String sub = a.substring(i, i+2);
            if (sub.equals("hi")){
                tracker++;
            }
        }
        System.out.println(tracker);

    }
}
