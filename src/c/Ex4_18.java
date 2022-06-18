package c;
import java.util.Scanner;
public class Ex4_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accNum;
        int balance;
        int totCharged;
        int totCred;
        int limit;
        int newBal;
        System.out.printf("Enter account number: ");
        accNum = scan.nextInt();
        System.out.printf("\nEnter balance at the beginning of the month: ");
        balance = scan.nextInt();
        System.out.printf("\nEnter total of all items charged by the customer this month: ");
        totCharged = scan.nextInt();
        System.out.printf("\nEnter total of all credits applied to the customer’s account this month: ");
        totCred = scan.nextInt();
        System.out.printf("\nEnter allowed credit limit: ");
        limit = scan.nextInt();
        newBal = balance+totCharged-totCred;
        System.out.printf("\nNew balance: " + newBal);
        if(newBal>limit){
            System.out.printf("\nCredit limit exceeded.");
        }
    }
}
