package firstdioexercise;

import java.util.Scanner;

/*
 * @author Aenã
 */
public class FirstDioExercise {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insert two numbers:");

        double numberOne = keyboard.nextDouble();
        double numberTwo = keyboard.nextDouble();

        Calculator.calculator(numberOne, numberTwo);

        CheckDate.checkDate();

        Loan.calcLoan();
    }
}
