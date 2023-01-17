package Day31_inheritance.animal_methodOverriding;

public class TestAnimalObject {
    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bangle",'F',4,"Small","Gray");

        Dog dog = new Dog("Max","Husky",'M',3,"Large","White");

        Lion lion = new Lion("Simba","African lion",'M',6,"Large","Yellow");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);

        cat.eat();
        dog.eat();
    }
}
