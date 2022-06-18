package c;
import java.util.Scanner;
public class Ex4_36 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.printf("Enter a: ");
        a = scan.nextInt();
        System.out.printf("Enter b: ");
        b = scan.nextInt();
        System.out.printf("Enter c: ");
        c = scan.nextInt();
        if(isTriangle(a, b, c))
            System.out.printf("The triangle is%sright angled.\n",
                    isRightAngled(a, b, c) ? " " : " NOT ");
        else
            System.out.println("The entered values could NOT be a triangle.");
    }

    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
    private static boolean isRightAngled(int a, int b, int c){
        int hypotenuse;

        if(a > b && a > c)
            hypotenuse = a;
        else if(b > a && b > c)
            hypotenuse = b;
        else
            hypotenuse = c;

        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2));
    }
}
