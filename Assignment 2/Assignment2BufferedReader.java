import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment2BufferedReader {
    public static void main (String[] args) {
        BufferedReader  dataIn = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print(" Enter hourly pay rate (Php):");
           double rate= Double.parseDouble(dataIn.readLine());

           System.out.print("Enter hours worked: ");
           double hours = Double.parseDouble(dataIn.readLine());
           double grossPay = hours * rate;
           double withholdingPercent = getWithholdingPercent(grossPay);
           double withholdingTax = grossPay * (withholdingPercent / 100);
           double netPay = grossPay - withholdingTax;

            System.out.printf("Gross Pay: Php %.2f%n", grossPay);
            System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", withholdingPercent, withholdingTax);
            System.out.printf("Net Pay: Php %.2f%n", netPay);

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
    static double getWithholdingPercent(double grossPay) {
        if (grossPay <= 2000.00) {
            return 10;
        } else if (grossPay <= 4000.00) {
            return 12;
        } else if (grossPay <= 10000.00) {
            return 15;
        } else {
            return 20;
        }
    }

}