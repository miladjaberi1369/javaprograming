package Day18_garbageCollection;

class car{

    public String brand;
    public String model;
    public String color;
    public int year;
}

public class MemoryAllocation {
    public static void main(String[] args) {

        int a = 100; // stack
    }

    public static void method1(){
        int b = 200;  // stack

    }

    public static void method2(){
        String c = "Hello world";
            // stack      heap(String pool)
        String d = new String("Hello world");
             // stack         heap

    }

}


