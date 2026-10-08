import java.util.Scanner;

public class Assignment4Scanner {
    public static void main(String[] args) {
     Scanner dataIn = new Scanner(System.in);

         try{
             System.out.print(" Enter height (cm) : ");
             double height = Double.parseDouble(dataIn.nextLine());

             System.out.print(" Enter age : ");
             int age = Integer.parseInt(dataIn.nextLine());

             System.out.print("Enter citizenship code (C/N) : ");
             char citizenship = dataIn.nextLine().trim().toUpperCase().charAt(0);

             System.out.print("Enter recommendee code (R/N) : ");
             char recommendee = dataIn.nextLine().trim().toUpperCase().charAt(0);

             String result = evaluateApplicant(height, age, citizenship, recommendee);
             System.out.println("Result: " + result);

         } catch(Exception e){
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
