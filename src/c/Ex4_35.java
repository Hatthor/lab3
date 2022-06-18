package c;
import java.util.Scanner;
public class Ex4_35 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter a: ");
        a = scan.nextInt();
        System.out.print("Enter b: ");
        b = scan.nextInt();
        System.out.print("Enter c: ");
        c = scan.nextInt();
        System.out.printf(" they could represent the sides of a triangle\n",
                isTriangle(a, b, c) ? " " : " NOT ");
    }
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }

}
