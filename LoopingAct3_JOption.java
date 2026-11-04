import javax.swing.JOptionPane;
public class LoopingAct3_JOption {
    public static void main (String[] args){


        double balance = 20000;
        JOptionPane.showMessageDialog(null, "Starting balance: P" + balance);

        String amountInput = JOptionPane.showInputDialog("Enter amount (0 to stop):");
        double amount = Double.parseDouble(amountInput);

        while (amount != 0) {
            if (balance + amount < 0) {
                JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
            } else {
                balance = balance + amount;
            }

            JOptionPane.showMessageDialog(null, "Outstanding balance: P" + balance);

            amountInput = JOptionPane.showInputDialog("Enter amount (0 to stop):");
            amount = Double.parseDouble(amountInput);
        }

        JOptionPane.showMessageDialog(null, "Final balance: P" + balance);
    }
}
