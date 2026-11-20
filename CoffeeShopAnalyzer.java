public class CoffeeShopAnalyzer {
// Ito ang unang class code, kung saan dapat parehas sya sa pangalan ng file

    public static void main(String[] args) {
// Ito naman ang unang main method kung saan dito magsisimula ang program

    // Part 1 : Pag-declare ng mga Arrays
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
// Benta kada araw base sa bnigay na given which is 7 days sya
        String[] daysofWeeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
// Mga araw na katapat nung benta

    // Part 2 : Pag-print ng data
        System.out.println("--- Daily Sales ---");
// Nagprint ng title block para hindi malito
        for (int i = 0; i < weeklySales.length; i++) {
// Start ng for loop simula index 0 hanggang index 6
            System.out.println(daysofWeeks[i] + " sales : " + weeklySales[i]);
// Dito prinint yung araw at kung ilan ang benta sa araw na iyon
        }

    // Part 3: Total at Average
        int totalSales = 0;
// Dito naman ang lagayan ng total sales kung saan nagsisimula sya 0
        for (int dailysale : weeklySales) {
// Kinuha isa-isa yung benta gamit ang for each loop
            totalSales += dailysale;
// Pinag-add yung bawat benta sa total
        }
        double averageSales = (double) totalSales / weeklySales.length;
// Dito nagdivide ng total by 7, since pito ang araw sa isang week at gumamit ng double para hindi mawala ang decimal
        System.out.println("--- Weekly Summary--- ");
// Title block ulit para naman sa weekly summary
        System.out.println("Total sales of the week: " + totalSales + " cups ");
// Prinint ang total sale which is 1135 cups
        System.out.println("Average daily sales: " + averageSales + " cups ");
// Prinint naman ang average daily sales which is 162.14 cuos


        // Part 4 & Bonus: Hanapin ang maximum at minimum sales
        int maxSales = weeklySales[0];
// Inassume ko na ang unang benta ang pinaka- mataas which is 120 cups
        int minSales = weeklySales [0];
// Inassume ko na yun din ang pinakamababa
        String bestDay = daysofWeeks[0];
// Dito ilalagay ang pinaka-mataas which is monday kasi nasa index 0 sya
        String worstDay = daysofWeeks[0];
// Dito ilalagay ang pinaka-mababa which is monday kasi nasa index 0 sya

        for(int i =1; i< weeklySales.length; i++){
// Nagstart na  magloop  simula index 1 kasi nasa max at min na ang index 0
       // Pag-check ng bagong maximum
        if(weeklySales[i] > maxSales){
// Dito chinecheck kung mas mataas ba yung current na benta
         maxSales = weeklySales[i];
// Kung oo, yun na ang bagong max
         bestDay = daysofWeeks[i];
// Isasave din kung anong araw iyon
        }
      //  Pag-check ng bagong minimum
            if(weeklySales[i] < minSales) {
//  Dito chinecheck kung mas mababa ba yung current na benta
                minSales = weeklySales[i];
// Kung oo, yun na ang bagong min
                worstDay = daysofWeeks[i];
// Isasave din kung anong araw iyon
            }

        } // Pagsarado ng loop
                System.out.println("\n--- Bests and Worsts ---");
                // Title po; yung \n ay para may bakanteng linya bago ito
                System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
                // Pini-print po yung araw na pinakamataas ang benta
                System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
                // Pini-print po yung araw na pinakamababa ang benta

    } // Pagsarado ng main method
} // Pagsarado ng main class

