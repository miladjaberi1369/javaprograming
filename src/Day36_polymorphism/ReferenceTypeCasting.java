package Day36_polymorphism;

import Day29_inheritance.animalTask.Animal;
import Day29_inheritance.animalTask.Dog;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

       Dog dog = new Dog();

        Animal animal = new Dog(); // implicit casting

        System.out.println("---------------------------------------------------------------------");

        Animal animal1 = new Dog(); // upcasting --> polymorphism
        animal1.setInfo("Max","Husky",'M',4,"Large","White");

        animal1.eat();
        animal1.drink();


        animal1.sleep();

        ( (Dog)animal1 ).bark(); // down casting

        Dog dog1 = (Dog)animal1; // down casting
        dog1.bark();






    }
}
