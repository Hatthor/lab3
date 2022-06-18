package c;
import java.util.Scanner;
public class Ex4_22 {
    public static void main(String[] args) {
        int n=1;
        int ten=10;
        int hundred=100;
        int thousand=1000;
        int a;
        int b;
        int c;
        int d;
        System.out.println("N \t10*N\t100*N\t1000*N\n");
        Scanner scan = new Scanner(System.in);

        for(int i=1;i<=10;i++)
        {
            System.out.print("\n"+ i + "\t"+ (i*10) +"\t    " + (i*100) +"\t    "+ (i*1000));
        }
        //  return 0;
    }
}
