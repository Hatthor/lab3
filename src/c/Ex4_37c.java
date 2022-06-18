package c;
import java.util.Scanner;
public class Ex4_37c {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of times to calculate e^x: ");
        n = scan.nextInt();

        System.out.print("Enter x: ");
        int x = scan.nextInt();

        System.out.printf("e^%d %d times = %.2f\n", n, n, getValueE(n, x));
    }

    private static int getFactorial(int x){
        int factorial = x;

        if(x > 1)
            x--;

        while(x > 0){
            factorial *= x;
            x--;
        }
        return factorial;
    }

    private static double getValueE(int n, int x){
        double e = 1.0;

        for(int i=1; i<=n; i++){
            e += x/getFactorial(i);
            x = (int)Math.pow(x, i);
        }
        return e;
    }
}
