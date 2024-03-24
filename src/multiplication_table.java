//Java Program to Print Multiplication Table for any Number
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = scanner.nextInt();
        System.out.println("Table of :" +number);
        for(int i=1;i<=10;i++)
        {
            int output =number*i;
            System.out.println(number+ "*" +i+ "=" +output );
        }
    }
}
