//Print any 10 numbers between given/user input range. For eg. Print numbers
//between 23-33
import java.util.Scanner;
class Print_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int no1 = scanner.nextInt();
        System.out.println("Printing ten number after "+ no1);
        for (int i = no1+1; i <= (no1 +10); i++)//print the 10 number after the given number
            {
                System.out.println(i);
            }
        }
    }








