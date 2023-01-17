package Day26_statics;

public class ConstructorsCalls2 {

    public ConstructorsCalls2(){
        System.out.println("Default");
    }
    public ConstructorsCalls2(int a){
        this(); // calling the default constructor
        System.out.println("int arg");
    }
    public ConstructorsCalls2(String a){
        this(10);// calling the int constructor
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorsCalls2 obj1 = new ConstructorsCalls2();

        ConstructorsCalls2 obj2 = new ConstructorsCalls2(10);

        ConstructorsCalls2 obj3 = new ConstructorsCalls2("Java");





        }
}
