//Reverse a number using for Loop
import java.util.Scanner;

public class reverse_number {
    static int reverse = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any number : ");
        int number = scanner.nextInt();

        for (; number != 0; ) {

            int reminder = number % 10;
            reverse = reverse * (10) + reminder;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}