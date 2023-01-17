package HomeWork;

public class SalaryCalcolator {
    public static void main(String[] args) {
        //7. Create a class named SalaryCalculator, and declare the following variables:
        //                hourlyRate
        //                weeklyHours
        //                stateTaxRate
        //                federalTaxRate
        //
        //    7.1 Use the given info above to calculate the followings:
        //                salaryBeforeTax
        //                stateTax
        //                federalTax
        //                totalTax
        //                salaryAfterTax
        //
        //    7.2 Display each of the above in the following format:
        //        Ex:
        //              hourlyRate = $50
        //              weeklyHours = 45
        //              stateTax = 6  (given as percentage)
        //              federalTax = 26 (given as percentage)
        //
        //        output:
        //               Gross pay is: $117000
        //                    Federal tax is: $30420
        //                    State tax is: $7020
        //                    Total tax is: $37440
        //                     Net income is: $79560

        double hourlyRate = 50,
            weeklyHours = 45;

        double stateTax = 6,
                federalTax = 26;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax_pay = salaryBeforeTax * stateTax  / 100 ;
        double federalTax_pay = salaryBeforeTax * federalTax * .01;
        double totallTax = stateTax_pay + federalTax_pay;
        double salaryAfterTax = salaryBeforeTax - totallTax;

        System.out.println("Gross pay is :$" + salaryBeforeTax);
        System.out.println("FederalTax is : $" + federalTax_pay);
        System.out.println("State tax is : $" + stateTax_pay);
        System.out.println("Totall tax is : $" + totallTax);
        System.out.println("Net income is : $" + salaryAfterTax);
    }

















}
