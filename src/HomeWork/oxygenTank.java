package HomeWork;

public class oxygenTank {
    public static void main(String[] args) {

        double tankLevel = 45;
        String level_massage = "" ;
        if (tankLevel <= 0 && tankLevel <= 100){

            if (tankLevel >= 90 && tankLevel >= 100){
                level_massage = "your tank is full";
            }
            else if (tankLevel >= 80){
                level_massage = "still okay";
            }
            else if (tankLevel >= 70){
                level_massage = "Don't go too far";
            }
            else if (tankLevel >= 60){
                level_massage = "Start to head back";
            }
            else if (tankLevel >= 50){
                level_massage = "Be careful now you at at 50%";
            }
        } else {

            level_massage = "tank_brocken";

        }
        System.out.println(level_massage);

    }


//8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
  //  Above 90 -  Your tank is full
    // Above 80 -  Still okay
  //  Above 70 -  Don't go too far
   // Above 60 -  Start to head back
   // Above 50 -  Be careful now you at at 50%

   // USE ONE PRINT STATEMENT ONLY








}
