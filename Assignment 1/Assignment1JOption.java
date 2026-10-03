import javax.swing.JOptionPane;
public class Assignment1JOption {
    public static void main(String[] args) {

        try {
            String yearInput = JOptionPane.showInputDialog("Enter a year:");
            int year = Integer.parseInt(yearInput);


            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
              String output = year + " is a leap year.";
                JOptionPane.showMessageDialog(null, output);
            } else {
               String output = year + " is not a leap year.";
                JOptionPane.showMessageDialog(null, output);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }

    }

}


