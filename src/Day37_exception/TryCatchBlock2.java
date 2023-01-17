package Day37_exception;

public class TryCatchBlock2 {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); // display full detail of the exception after the program execution

        }
        System.out.println("Program1 ended");
    }
}
