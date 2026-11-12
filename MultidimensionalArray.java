// Ini-import ang Arrays class mula sa java.util para magamit ang Arrays.deepToString()
import java.util.Arrays;

// Ito naman ang unang class ng code, kung saan dapat parehas sa name ng file
    public class MultidimensionalArray {

// Ito naman ang main method kung saan dito magsisimula ang program
    public static void main (String [] args){

// Dito magdedeclare at mag- iinitialize ng 2d string array na "seats" (kung saan may 2 rows at 3 columns bawat row)
        String seats[][] = {
                // Row 1 (index 0):  mga nakaupo sa unang row
                {"Alice", "Bob", "Charlie"},
              // Row 2 (index 1): mga nakaupo sa second row
                {"David", "Emma" , "Frank"}
        }; // Ginagamit upang pagsara ng array initializer
        // Kinukuha at ipini-print ang nasa ikalawang row (index 1) at ikatlong column (index 2), si Frank
        System.out.println("Person in Row 2, Seat 3: " + seats[1][2]);

        // Pinapalitan ang "Bob" (row index 0, column index 1) ng "Vacant"
        seats[0][1] = "Vacant";

        // Ipini-print ang buong seating arrangement sa isang linya gamit ang Arrays.deepToString()
        System.out.println(Arrays.deepToString(seats));

    } // Pagsasara ng main method
} // Pagsasara ng MultiDimensionalArray class