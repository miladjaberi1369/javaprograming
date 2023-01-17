package HomeWork;

public class JavaPython {
    public static void main(String[] args) {
        String a = "We study java not python";
        String b = "What's the difference between java, javascript and python?";

        int java = 0;
        int python = 0;

        String[] ab = a.split(" ");

        for (int i = 0; i < ab.length; i++) {
            if (ab[i].contains("java")){
                java++;
            } else if (ab[i].contains("python")) {
                python++;
            }
        }

        System.out.println(java == python);


    }
}
