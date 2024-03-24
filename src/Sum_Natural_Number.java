//Display Sum of n Natural Number
import java.util.Scanner;
public class Sum_Natural_Number {
    static int sum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();

             sum=(number*(number+1))/2;

        System.out.println("sum of Natural Number : "+sum);

    }
}
