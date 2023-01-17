package Day26_statics;

public class ConstructorsCalls {

    public ConstructorsCalls(){
        System.out.println("Default constructor");
    }
    public ConstructorsCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorsCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorsCalls(String c){
        this(2.5);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();
        System.out.println("-----------------------------------------");

        method2();
    }

    public static void method1(){
        System.out.println("Method1");
    }
    public static void method2(){
        method1();
        System.out.println("Method2");
    }





}
