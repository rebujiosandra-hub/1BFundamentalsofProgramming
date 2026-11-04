import javax.swing.JOptionPane;
public class LoopingAct2_JOption {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Press enter to display the even numbers from 2 to 80 ");
        String output = "";

        for (int x = 2; x <= 80; x = x + 2) {
            output = output + x + " ";

            if (x % 20 == 0) {
                output = output + "\n";
            }

        }
        JOptionPane.showMessageDialog(null, output);
    }
}