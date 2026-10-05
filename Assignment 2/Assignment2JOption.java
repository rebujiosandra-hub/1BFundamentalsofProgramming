import javax.swing.JOptionPane;
public class Assignment2JOption {
    public static void main(String[] args) {

        try {
            String rateInput = JOptionPane.showInputDialog(" Enter hourly pay rate (Php) :");
            double rate = Double.parseDouble(rateInput);

            String hoursInput = JOptionPane.showInputDialog(" Enter hours worked :");
            double hours = Double.parseDouble(hoursInput);

            double grossPay = hours * rate;
            double withholdingPercent = getWithholdingPercent(grossPay);
            double withholdingTax = grossPay * (withholdingPercent / 100);
            double netPay = grossPay - withholdingTax;

            String result = String.format(
                    "Gross Pay: Php %.2f%nWithholding Tax (%.0f%%): Php %.2f%nNet Pay: Php %.2f",
                    grossPay, withholdingPercent, withholdingTax, netPay
            );

            JOptionPane.showMessageDialog(null, result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
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
