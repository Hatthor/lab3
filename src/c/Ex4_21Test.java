package c;
import java.util.Scanner;
public class Ex4_21Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex4_21 ln = new Ex4_21();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter a number: ", i+1);
            ln.enterNumber(sc.nextInt());
        }
        System.out.printf("The largest number is: %d\n", ln.getLargestNumber());
    }
}
