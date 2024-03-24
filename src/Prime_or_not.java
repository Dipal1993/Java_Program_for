//Program to check whether input number is prime or not
import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any number : ");
        int number = scanner.nextInt();
        if(number%2==0){//check the number is devided by 2 or not
            System.out.println("given number is even");
        }else {
            System.out.println("given number is odd");
        }
    }
}
