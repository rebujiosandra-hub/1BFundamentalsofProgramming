
import java.util.Scanner;

public class Assignment3Scanner {
    public static void main (String[] args) {
        Scanner dataIn = new Scanner(System.in);

        try {
            System.out.print("Enter NSAt score : ");
            double nsat = Double.parseDouble(dataIn.nextLine());

            System.out.print("Enrer parent's monthly salary : ");
            double salary = Double.parseDouble(dataIn.nextLine());

            System.out.print(" Enter  entrance exam score : ");
            double score = Double.parseDouble(dataIn.nextLine());

            String result = evaluateApplicant(nsat, salary, score);
            System.out.println(" Result: " + result);

        } catch (Exception e){
                System.out.print(" Error! ");
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
