package Day38_exception;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        method1();

    }
    public static void pauseFor5Second() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void method1() throws InterruptedException {
        System.out.println("Hello Word");
        pauseFor5Second();
        System.out.println("Hello Cydeo");
    }
}
