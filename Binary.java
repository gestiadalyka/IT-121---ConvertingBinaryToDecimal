/******************* ******************
 ******************
 *****
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Lyka Gestiada
 * Kaye Granado
 * Jorlyn Faith Gona
 * Geselle Goboli
 * Janice Docot
 *
 * Class: IT 121 Instructor: John Mark D. Gabrentina
 *
 * Pledge: I have neither given nor received unauthorized aid
 * on this program. (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************
 ******************
 ****************** ******/

// Imported packages

import javax.swing.*;

public class binary {

    // Main method
    public static void main(String[] args) {

        // Request 6-bit binary number
        String binaryString = JOptionPane.showInputDialog("Enter a 6-bit binary number");

        // Convert from String to integer type
        int binary = Integer.parseInt(binaryString);

        // Declaration of output value
        int decimal = 0;

        // Declaration of variable to hold the current bit
        int bit;

        /*
         * 
         * // get the last bit (6th)
         * bit = binary % 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * System.out.println("\tPrevious Decimal value =" + decimal +"+"+ bit +" * "+
         * i);
         * decimal = decimal + bit;
         * System.out.println("\tCurrent decimal value: "+ decimal);
         * 
         * binary = binary / 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * //get the last bit (5th)
         * bit = binary % 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * System.out.println("\tPrevious Decimal value =" + decimal +"+"+ bit +" * "+
         * i);
         * decimal = decimal + bit * 2;
         * System.out.println("\tCurrent decimal value: "+ decimal);
         * 
         * binary = binary / 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * //get the last bit (4th)
         * bit = binary % 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * System.out.println("\tPrevious Decimal value =" + decimal +"+"+ bit +" * "+
         * i);
         * decimal = decimal + bit * 4;
         * System.out.println("\tCurrent decimal value: "+ decimal);
         * 
         * binary = binary / 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * //get the last bit (3rd)
         * bit = binary % 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * System.out.println("\tPrevious Decimal value =" + decimal +"+"+ bit +" * "+
         * i);
         * decimal = decimal + bit * 8;
         * System.out.println("\tCurrent decimal value: "+ decimal);
         * 
         * 
         * binary = binary / 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * //get the last bit (2nd)
         * bit = binary % 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * System.out.println("\tPrevious Decimal value =" + decimal +"+"+ bit +" * "+
         * i);
         * decimal = decimal + bit * 16;
         * System.out.println("\tCurrent decimal value: "+ decimal);
         * 
         * binary = binary / 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * //get the last bit (1st)
         * bit = binary % 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         * System.out.println("\tPrevious Decimal value =" + decimal +"+"+ bit +" * "+
         * i);
         * decimal = decimal + bit * 32;
         * System.out.println("\tCurrent decimal value: "+ decimal);
         * 
         * binary = binary / 10;
         * System.out.println("binaryNumber: "+ bit);
         * 
         */
        int i = 0;
        int power2 = 1;
        int len = binaryString.length();
        while (i < len) {
            bit = binary % 10;
            System.out.println("binaryNumber: " + bit);

            System.out.println("\tPrevious Decimal value =" + decimal + "+" + bit + " * " + i);

            decimal = decimal + bit * power2;
            System.out.println("\tCurrent decimal value: " + decimal);

            binary = binary / 10;
            System.out.println("binaryNumber: " + bit);

            power2 *= 2;
            i++;

        }
        // Format output String
        String binaryOutput = "Binary: " + binaryString;
        String decimalOutput = "Decimal: " + decimal;

        // Output message
        JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput, "Binary to Decimal Conversion",
                JOptionPane.INFORMATION_MESSAGE);

        // Exit
        System.exit(0);

    }

}