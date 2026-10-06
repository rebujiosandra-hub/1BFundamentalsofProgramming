import java.io. BufferedReader;
import java.io. InputStreamReader;

public class Assignment3BufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print(" Enter NSAT score : ");
            double nsat = Double.parseDouble(dataIn.readLine());

            System.out.print(" Enter parent's monthly salary : ");
            double salary = Double.parseDouble(dataIn.readLine());

            System.out.print(" Enter entrance exam score: ");
            double score = Double.parseDouble(dataIn.readLine());

           String result = evaluateApplicant(nsat, salary, score);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    static String evaluateApplicant(double nsat, double salary, double examScore) {
        if (salary > 10000 || nsat < 90 || examScore < 85) {
            return ("Rejected");
        } else if (salary <= 3500 && ((nsat + examScore) / 2) >= 91) {
            return ("Accepted");
        } else {
            return ("For Further Study");

        }

    }
}
