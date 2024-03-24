//Making Calculator using the switch statement (The program takes three inputs
//from the user: one operator and 2 numbers. Based on the operator provided
//by the user, it performs the calculation on the numbers. Then the result is
//displayed on the screen.)

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        float number1 = scanner.nextFloat();
        System.out.println("Enter the number 2: ");
        float number2 = scanner.nextFloat();
        System.out.println("Enter the symbol: ");
        char symbol = scanner.next().charAt(0);

        switch (symbol){

            case '+':
                System.out.println("addition" +(number1+number2));
                break;
            case '-':
                System.out.println("subtraction" +(number1-number2));
                break;
            case '*':
                System.out.println("Multiplication" +(number1*number2));
                break;
                case '/':
                if(number2 == 0 || number1==0){
                    System.out.println("Devision is not possible");
                    }
                else
                {
                    System.out.println("Devision: " +(number1/number2));
                }
                break;

                default:
                System.out.println("Enter the valid symbol");
        }
    }
}
