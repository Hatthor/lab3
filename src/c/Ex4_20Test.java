package c;
import java.util.Scanner;
public class Ex4_20Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ex4_20 salaryCalc = new Ex4_20();

        for(int i=1; i<4; i++){
            System.out.printf("Employee %d weekly hours: ", i);
            salaryCalc.setHours(scan.nextDouble());

            System.out.printf("Employee %d hourly pay: ", i);
            salaryCalc.setHourlyPay(scan.nextDouble());

            System.out.printf("Employee %d gross pay: %.2f\n", i, salaryCalc.calculateGPay());
        }
    }
}
