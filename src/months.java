//.WAP to print month names with 1-12 – other invalid entry by using switch.
import java.util.Scanner;
public class months {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print ("Enter the number between 1 to 12: ");
        int number1 = scanner.nextInt();
        System.out.print("The " +number1+ " month is : ");
        switch (number1){

            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:{
                System.out.print("invalid entry");
            }

        }


    }

}
