package Day35_polymorphism.transportationTask;

import Day34_abstraction.animalTask.Flyable;

public abstract class Plan extends Transportation implements Flyable {
    public Plan(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    public void land(){
        System.out.println("Plane " + getMake()+ " " + getModel()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+ " " + getModel()+ " is flying");
    }

}
