import java.util.Scanner;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.
public class Fibonacci_Number {
    static int a = 1;
    static int b = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        System.out.println("Fibonacci Series till the " + n);
        for (int i = 1; i <= n; i++) {//loop till the n
            System.out.print(+a + " , ");
            int c = a + b;//sum of a and b
            a = b;//swapping the number
            b = c;//swapping the number
        }
    }
}
