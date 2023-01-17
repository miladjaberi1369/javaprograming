package Day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

    Dog dog = new Dog();
    dog.setInfo("Max", "Husky", 'M', 4 , "Large", "White");
    
    Cat cat = new Cat();
    cat.setInfo("Felicia", "Stray", 'F', 3, "Medium", "Black");
    
    Tiger tiger = new Tiger();
    tiger.setInfo("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        dog.eat();
        dog.sleep();
        dog.drink();

    }
}
