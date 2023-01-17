package Day39_Collection.multithreading;

public class ThreadHelloWord extends Thread{

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello word " +i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
