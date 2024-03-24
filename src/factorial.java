//Finding factorial of a number entered by user
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any number : ");
        int number = scanner.nextInt();
        int fact = 1;
        for(int i=1;i<=number;i++)
        {
        fact =fact*i;

    }
        System.out.println("Factorial : "+(fact));
    }}



