import java.util.Scanner;
public class LoopingAct1_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num = input.nextInt();
        int high = num;
        int low = num;

        for (int x = 2; x <= 10; x++) {
            System.out.print("Enter number " + x + ": ");
            num = input.nextInt();

            if (num > high) {
                high = num;
            }
                if (num < low) {
                    low = num;
                }
            }
            System.out.println("Highest: " + high);
            System.out.println("Lowest: " + low);
        }

    }




