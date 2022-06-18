package c;
import java.util.Scanner;

public class Ex4_37a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.printf("e = %.2f\n", getConstantE(n));

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

    private static double getConstantE(int x){
        double e = 1.0;

        for(int i=1; i<=x; i++){
            e += 1.0/getFactorial(i);
        }
        return e;
    }
}
