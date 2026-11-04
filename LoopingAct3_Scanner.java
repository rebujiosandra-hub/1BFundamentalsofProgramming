import java.util.Scanner;
public class LoopingAct3_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 20000;
        System.out.println("Starting balance: P" + balance);

        System.out.print("Enter amount (0 to stop): ");
        double amount = input.nextDouble();

        while (amount != 0) {
            if (balance + amount < 0) {
                System.out.println("INSUFFICIENT FUNDS!");
            } else {
                balance = balance + amount;
            }

            System.out.println("Outstanding balance: P" + balance);

            System.out.print("Enter amount (0 to stop): ");
            amount = input.nextDouble();
        }

        System.out.println("Final balance: P" + balance);

        }
    }

