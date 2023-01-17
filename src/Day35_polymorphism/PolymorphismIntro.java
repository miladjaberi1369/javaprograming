package Day35_polymorphism;

import Day34_abstraction.animalTask.*;

import javax.swing.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',4,"Small","white");
        Cat cat = new Cat("Max","Husky",'M',4,"Small","white");
        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck};

    }
}
