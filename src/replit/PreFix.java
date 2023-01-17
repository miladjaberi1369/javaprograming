package replit;

public class PreFix {
    public static void main(String[] args) {
        String str = "abcdabcXYc";
        int n = 4;
        String prefix = str.substring(0, n);
        boolean rep = false;

        for (int i = n; i < str.length()-(n-1); i++) {
            if(str.substring(i, i+n).equals(prefix)){
                rep = true;
                break;
            }
        }

        System.out.println(rep);
    }
}
