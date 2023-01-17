package Day31_inheritance.vehicleTask;

public class AirPlan extends Vehicle{

    public AirPlan(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
    public void fly(){
        System.out.println(getBrand()+ " " + getModel()+ " is flying");
    }
}
