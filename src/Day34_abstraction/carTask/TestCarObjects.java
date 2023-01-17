package Day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {

        Honda honda = new Honda("Accord","Black",2020,35000);

        Audi audi = new Audi("A6","Gray",2019,52000);

        Tesla tesla = new Tesla("Model Y","Blue",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.stop();
        audi.stop();
        tesla.stop();

        honda.start();
        audi.start();
        tesla.start();
    }
}
