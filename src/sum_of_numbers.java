//Write a program in Java to display n limit of natural numbers and their sum.
import java.util.Scanner;
public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the any number : ");
        int sum=0;
        int number = scanner.nextInt();
        System.out.println("The numbers from 1 to " +number+ " is ");
        for(int i=1;i<=number;i++){
            System.out.print(+i+ " , ");
            sum = sum+i;//to calculate sum
        }System.out.println();
        System.out.print("Addition on all natural number is: "+sum);
    }
}
