package c;
import java.util.Scanner;
public class Ex4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        while (studentCounter <= 10) {
            System.out.println("Enter result (1-pass, 2-fall): ");
            int result = input.nextInt();
            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;
            studentCounter = studentCounter + 1;

        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
