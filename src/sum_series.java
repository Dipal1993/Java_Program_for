//.Write a program to calculate the sum of following series where n is
//input by user. (where n is a positive integer and input by user.)
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

import java.util.Scanner;
public class sum_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        float sum=0.0f;// Use float for sum to handle floating-point division
   for(int i=1;i<=n;i++)
   {

       sum += 1.0/i;

   }
        System.out.println(sum);
    }
}