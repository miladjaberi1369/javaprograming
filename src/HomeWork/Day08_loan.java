package HomeWork;

public class Day08_loan {
    public static void main(String[] args) {
// 2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.
//        To be approve for the loan, print: "Loan Approved":
//        Salary: above 60,000
//        Credit Score: above 650
//
//       // Otherwise print: "Loan Denied"
//
//       // NOTE: MUST USE TERNARY.

        int salary = 50;
        int credit_score = 750;
        String result = "";

        String loan = (salary >= 60000 && credit_score >= 650)? "loan approved" : " loan denied";
        System.out.println(loan);





    }
}
