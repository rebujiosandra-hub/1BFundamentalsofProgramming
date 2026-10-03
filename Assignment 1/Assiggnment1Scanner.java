import java.util.Scanner;

public class Assiggnment1Scanner {
        public static void main(String[] args) {
            Scanner dataIn = new Scanner(System.in);

            try {
                System.out.print("Enter a year: ");
                String yearInput = dataIn.nextLine();
                int year = Integer.parseInt(yearInput);

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } catch (Exception e) {
                System.out.println("Error!");
            }
    }
}
