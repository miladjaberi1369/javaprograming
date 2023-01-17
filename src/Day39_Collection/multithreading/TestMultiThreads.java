package Day39_Collection.multithreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWord();
        Thread thread2 = new ThreadHelloWord();
        Thread thread3 = new ThreadHelloWord();
        Thread thread4 = new ThreadHelloWord();
        Thread thread5 = new ThreadHelloWord();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
