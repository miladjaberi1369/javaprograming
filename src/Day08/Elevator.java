package Day08;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 4;
        if (floorNumber >= 1 && floorNumber <= 3) {
            if (floorNumber == 1) {
                System.out.println("Floor 1 selected , mj company");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected , verizon");
            } else {
                System.out.println("Floor 3 selected , kuni");
            }
            System.out.println("invalid floor");
        }else{
            System.out.println("invalid number");
            }
        }
    }

