package Day34_abstraction.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck " + getName()+ " is eating worm");
    }

    @Override
    public void play() {
        System.out.println("Duck " + getName()+ " is playing on the water");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
