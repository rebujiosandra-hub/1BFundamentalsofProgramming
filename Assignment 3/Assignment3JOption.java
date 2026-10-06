import javax.swing.JOptionPane;

public class Assignment3JOption {
  public static void main (String[] args){

   try{
   String nsatInput = JOptionPane.showInputDialog("Enter NSAT score : ");
   double nsat = Double.parseDouble(nsatInput);

   String salaryInput= JOptionPane.showInputDialog(" Enter parent's monthly salary :");
   double salary = Double.parseDouble(salaryInput);

   String examInput = JOptionPane.showInputDialog(" Enter entrance exam score :");
   double examScore = Double.parseDouble(examInput);

   String result = evaluateApplicant(nsat, salary, examScore);
       JOptionPane.showMessageDialog(null, "Result: " + result);

   } catch (Exception e) {
       JOptionPane.showMessageDialog(null, "Error!");
   }

  }

    static String evaluateApplicant(double nsat, double salary, double examScore) {
        if (salary > 10000 || nsat < 90 || examScore < 85) {
            return "Rejected";
        } else if (salary <= 3500 && ((nsat + examScore) / 2) >= 91) {
            return "Accepted";
        } else {
            return "For Further Study";
        }
    }
}