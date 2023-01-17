package Day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, getNumberOfPepperoniTopping;

    // calculate total cost of the pizza , return it as dauble
    public double calCost() {
        double totalPrice = 0;
        switch (size){
            case 'S':
            case 's':
              totalPrice = 10 + 2 *(numberOfCheeseTopping + getNumberOfPepperoniTopping);
              break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;
            default:
                System.err.println("Invalid size: "+ size );
        }

        return totalPrice;
    }

    public void setInfo(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", getNumberOfPepperoniTopping=" + getNumberOfPepperoniTopping +
                ", total price=" + calCost() +
                '}';
    }
}
