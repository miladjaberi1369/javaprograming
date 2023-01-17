package Day16_nestedloop;

public class DoWhileLoop {
    public static void main(String[] args) {
        
        boolean condition = false;
        for (; condition ;) {
            System.out.println("Hello Cydeo");   // for loop beacuse is false not printing
            
        }
        while (condition){
            System.out.println("Hello Cydeo");   // while loop becuse is false is not printing
        }
        System.out.println("----------------------------------");
        do {
            System.out.println("Hello Cydeo");   // Do While loop is printing
        }while (condition);
    }
}
