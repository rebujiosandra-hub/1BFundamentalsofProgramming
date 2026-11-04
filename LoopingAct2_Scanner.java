import java.util.Scanner;
public class LoopingAct2_Scanner {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        for(int x = 2; x<=80; x= x + 2){
            System.out.print(x + " ");
            if(x % 20 == 0){
                System.out.println();
            }
        }
    }
}
