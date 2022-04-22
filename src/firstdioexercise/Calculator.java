/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstdioexercise;

/*
 * @author Aenã
 */
public class Calculator {
    public static void calculator(double number1,double number2){
        double sum = number1 + number2;
        double sub = number1 - number2;
        double mult = number1 * number2;
        double div = number1 / number2;
        System.out.println("\nOPERACTIONS");
        System.out.printf("Sum: %.2f \nSubtraction: %.2f \nMultiplication: %.2f \nDivision: %.2f \n", sum, sub, mult, div);
    }
}
