package c;
import java.util.Scanner;
public class Ex4_23Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex4_23 tl = new Ex4_23();
        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter number: ", i+1);
            tl.enterNumber(sc.nextInt());
        }
        System.out.printf("First largest number: %d\n",
                tl.getFirstLargest());
        System.out.printf("Second largest number: %d\n", tl.getSecondLargest());
    }
}
