/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstdioexercise;

import java.util.Scanner;

/**
 *
 * @author Aenã
 */
public class Loan {

    private static void loanTwo(double value){
        double loan = (value * 0.3) + value;
        System.out.println("Final value of loan: " + loan);
    }

    private static void loanThree(double value){
        double loan = (value * 0.5) + value;
        System.out.println("Final value of loan: " + loan);
    }
    private static void loanFour(double value){
        double loan = (value * 0.8) + value;
        System.out.println("Final value of loan: " + loan);
    }

    public static void calcLoan(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nWhat amount do you want to borrow? ");
        double loan = keyboard.nextDouble();

        System.out.println("In how many installments? 2, 3 or 4?");
        short installment = keyboard.nextShort();

        switch (installment) {
            case 2:
                loanTwo(loan);
                break;
            case 3: 
                loanThree(loan);
                break;

            case 4:
                loanFour(loan);
                break;
            default:
                System.out.println("Invalid value");
        }
        
    }
}
