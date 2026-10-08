import javax.swing.JOptionPane;
public class Assignment4JOption {
    public static void main(String[] args) {
        try {
            double height = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter height (cm) : "));

            int age = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter age : "));

            char citizenship = JOptionPane.showInputDialog("Enter citizenship code (C/N) : ")
                    .trim().toUpperCase().charAt(0);

            char recommendee = JOptionPane.showInputDialog("Enter recommendee code (R/N) : ")
                    .trim().toUpperCase().charAt(0);

            String result = evaluateApplicant(height, age, citizenship, recommendee);
            JOptionPane.showMessageDialog(null, "Result: " + result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }

        System.exit(0);
    }

    static String evaluateApplicant(double height, int age, char citizenship, char recommendee) {
        if (recommendee == 'R') {
            return "Accepted";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            return "Accepted";
        } else {
            return "Rejected";
        }
    }

}
