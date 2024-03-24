//WAP to enter any String and count total number of 'a' in that String.
import java.util.Scanner;
public class count_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any text");
        String text = scanner.next();
        int count=0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                count = count+1;
            }

    } System.out.println("Total number of 'a' in the text: " + count);
}}
