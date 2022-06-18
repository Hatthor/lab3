package c;
import java.util.Scanner;
public class Ex4_29 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        while(s == 0 || s > 20){
            System.out.printf("Enter a number between 1 and 20: ");
            int input = scan.nextInt();

            if(input > 0 && input <= 20)
                s = input;
        }

        for(int i=0; i<s; i++){
            if(i == 0 || i == s-1){
                for(int j=0; j<s; j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int j=0; j<s-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
