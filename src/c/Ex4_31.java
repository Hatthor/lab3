package c;
import java.util.Scanner;
public class Ex4_31 {
    public static void main(String[] args) {

        {
            Scanner scan = new Scanner(System.in);
            ;            int bin = 0;
            int dec = 0;
            int place = 0;
            System.out.printf("Enter binary number: ");
            bin = scan.nextInt();
            while(bin  !=0)
            {
                int lastD = bin % 10;
                dec += lastD *Math.pow(2, place);
                bin /=10;
                place++;
            }
            System.out.printf("%d=%d\n",  dec);
        }
    }
}
