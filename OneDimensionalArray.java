// Ito naman ang unang class ng code, kung saan dapat parehas sa name ng file
public class OneDimensionalArray {

    // Ito naman ang main method kung saan dito magsisimula ang program
    public static void main (String [] args){

        // Nagdedeklara at gumagawa ng 1D double array na "temperatures" na eksaktong 5 elemento ang kaya
        double[] temperatures = new double[5];

        // Inilalagay ang 32.5 sa index 0 (unang araw)
        temperatures[0] = 32.5;
        // Inilalagay ang 34.0 sa index 1 (ikalawang araw)
        temperatures[1] = 34.0;
        // Inilalagay ang 31.8 sa index 2 (ikatlong araw)
        temperatures[2] = 31.8;
        // Inilalagay ang 33.2 sa index 3 (ikaapat na araw)
        temperatures[3] = 33.2;
        // Inilalagay ang 35.1 sa index 4 (ikalimang araw)
        temperatures[4] = 35.1;

        // Standard for loop: nagsisimula sa i = 0 at umuulit habang mas maliit ang i sa haba ng array (.length = 5)
        for (int i = 0; i < temperatures.length; i++) {
            // Ipini-print ang temperatura ng bawat araw; (i + 1) para magsimula sa Day 1 imbes na Day 0
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        } // Pagsasara ng for loop

        // Ina-update ang temperatura ng ikatlong araw (index 2) mula 31.8 papuntang 32.0
        temperatures[2] = 32.0;

        // Ipini-print ang bagong temperatura ng ikatlong araw
        System.out.println("Updated temperature for Day 3: " + temperatures[2]);

    } // Pagsasara ng main method
} // Pagsasara ng OneDimensionalArray class


