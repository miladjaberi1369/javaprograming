package Day35_polymorphism;

import Day34_abstraction.animalTask.Tiger;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher khan","Bengal",'M',5,"Large","Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();
    }
}
