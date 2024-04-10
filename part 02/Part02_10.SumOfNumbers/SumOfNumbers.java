
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(myScanner.nextLine());

            if (num == 0) {
                break;
            }

            sum += num;

        }
        System.out.println("Sum of the numbers: " + sum);

    }
}
