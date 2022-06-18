package c;
import java.util.Scanner;
public class Ex4_17 {
    public static void main(String[] args) {
        // write your code here
        float miles;
        float gallons;
        float result;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter miles: ");
        miles = scan.nextFloat();
        System.out.printf("Enter gallons: ");
        gallons = scan.nextFloat();
        result = miles/gallons;
        System.out.printf("Result: "+ result );
    }
}
