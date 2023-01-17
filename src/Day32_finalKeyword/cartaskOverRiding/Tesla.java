package Day32_finalKeyword.cartaskOverRiding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getMake()+ " " + getModel()+ " is in self-driving mode");

    }
    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake()+ " " + getModel());
    }
    @Override
    public void setModel(String model) {
        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model x", "Model 3"));

        if (models.contains(models)){
            System.err.println("Invalid Tesla Model: " + model);
            System.exit(1);
        }
        super.setModel(model); // this.model = model;
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if (!colors.contains(color)){
            System.err.println("Invalid Tesla Color: "+ color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year < 2008){
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price < 50000){
            System.err.println("Invalid price for tesla car: " + price);
            System.exit(1);
        }
        super.setPrice(price);
    }
}
