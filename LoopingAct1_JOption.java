import javax.swing.JOptionPane;
public class LoopingAct1_JOption {
    public static void main (String [] args){

      String numInput = JOptionPane.showInputDialog("Enter number 1: ");
        int num= Integer.parseInt(numInput);
        int high = num;
        int low = num;

    for (int x=2; x<=10; x++){
       numInput = JOptionPane.showInputDialog("Enter number "+ x + ": ");
       num = Integer.parseInt(numInput);

       if(num > high){
       high = num;
}
       if(num< low){
       low = num;
}
    }
JOptionPane.showMessageDialog(null, "Highest: " + high + "\nLowest: " + low);
    }

}