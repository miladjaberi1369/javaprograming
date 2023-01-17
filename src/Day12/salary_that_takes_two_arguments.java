package Day12;

public class salary_that_takes_two_arguments {
    public static void main(String[] args) {
        double hourly_rate = 45;
        int weekly_hours = 40;
        salary(hourly_rate , weekly_hours);
    }
    public static void salary(double hourlyRate , int weeklyRate){
        double salary = hourlyRate * weeklyRate * 52;
        System.out.println("You make $" + hourlyRate + " per hour");
        System.out.println("You work " + weeklyRate + " hours ia a week");
        System.out.println("Your gross income is $" + salary);

    }
}

//7. Create a method named salary that takes two arguments:
//        1. hourlyRate (double)
//        2. weeklyHours (int)
//
//        Then the method should display the salary of the person.
//        Ex:
//        salary(45, 40)
//
//        output:
//        You make $45.0 per hour
//        You work 40 hours in a week
//        Your gross income is $93600.0