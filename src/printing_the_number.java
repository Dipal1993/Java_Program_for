//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5
//separately
public class printing_the_number {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3:");
        for(int i=1;i<=100;i++){
            if(i% 3 ==0)
            {
            System.out.print(i + " , ");}
            }
        System.out.println();
        System.out.println("Numbers divisible by 5:");
        for(int i=1;i<=100;i++){
            if(i % 5 == 0)
            {
            System.out.print(i + " , ");
            }
        }
    }
}
