package day05;

public class SalaryCaculator {
    public static void main(String[] args) {

        double hourlyRate = 55,
                weeklyHour = 45,
                stateTaxRate = 7,
                federalTaxRate = 26;
        double salaryRateBeforeTax = hourlyRate * weeklyHour * 52;

        double stateTax = salaryRateBeforeTax * stateTaxRate / 100;
        double federalTax = salaryRateBeforeTax * federalTaxRate / 100;

        double totallTax = stateTax + federalTax;
        double salaryAfterTax = salaryRateBeforeTax - totallTax;

        System.out.println("Gross pay is : $" + salaryRateBeforeTax);
        System.out.println("salary tax is : $" + federalTax);
        System.out.println("state tax is : $" + stateTax);
        System.out.println("totall tax is : $" + totallTax);
        System.out.println("Net income is : $" + salaryAfterTax );



















    }
}
