import java.util.Scanner;

public class bigboss {

    public static void main(String[] args) {

        //importing scanner module
        Scanner keyboard = new Scanner(System.in);

        //variables declared
        double loan = 0;
        double i = 0;
        double monthlypayment = 0;
        double balance = 0;
        int term;

        //getting the loan ammount
        System.out.printf("Enter the loan amount: ");
        loan = keyboard.nextDouble();

        //getting the loan amount
        System.out.printf("Enter the interest rate on the loan: ");
        i = keyboard.nextDouble();

        //getting the years being committed for loan payment
        System.out.printf("Enter the term (years) for the loan payment: ");
        term = keyboard.nextInt();

        //printing a line
        System.out.printf("\n======================================\n");
        //closing out scanner
        keyboard.close();


        //doing calculations and printing the statement
        monthlypayment = getMonthlyPayment(loan, i, term);
        balance = -(monthlypayment*(term*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlypayment);
    }

//designing method to be used in the top.
    public static double getMonthlyPayment(double l, double i, int trm) {
        double rate = (i/ 100) / 12;
        double base = (1 + rate);
        double months = trm* 12;
        double result = 0.0;
        result = ((rate * l) / (1 - Math.pow(base, -months)));

        return result;
    }
}