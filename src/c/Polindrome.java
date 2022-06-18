package c;
import java.util.Scanner;
public class Polindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String num;

        System.out.printf("Enter a five-digit integer: ");
        num = scan.nextLine();
        if(num.length()!=5)
        {
            System.out.println("This number is not five-digit number.");
            return;
        }
        for(int i=0;i<2;i++)
            if(num.charAt(i)!=num.charAt(4-i))
            {
                System.out.println("This number is not a palindrome");
                return;
            }

        System.out.printf("This number is polindrome.");
    }
}
