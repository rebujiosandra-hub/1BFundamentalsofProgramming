import java.io. BufferedReader;
import java.io. InputStreamReader;

public class Assignment4BufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter height (cm) : ");
            double height = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter age : ");
            int age = Integer.parseInt(dataIn.readLine());

            System.out.print("Enter citizenship code (C/N) : ");
            char citizenship = dataIn.readLine().trim().toUpperCase().charAt(0);

            System.out.print("Enter recommendee code (R/N) : ");
            char recommendee = dataIn.readLine().trim().toUpperCase().charAt(0);

            String result = evaluateApplicant(height, age, citizenship, recommendee);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.print("Error! ");
        }
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