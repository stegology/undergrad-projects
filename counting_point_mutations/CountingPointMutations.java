package counting_point_mutations;

import java.util.Scanner;

/* This program will ask the user to input two DNA sequences. 
 * The program will count the Hamming distance (min number of symbols that are different) between the two strings.
 * The program will validate for invalid entries (e.g. if the user inputs a number or a special character).
 */


public class CountingPointMutations {

    
        
    public static int countHammingDistance(String dnaSequence1, String dnaSequence2) {
        // Initialize count for hamming distance
        int hammingDistance = 0;

         // Loop through the two sequences and count the number of differences
         for (int i = 0; i < dnaSequence1.length(); i++) {
            if (dnaSequence1.charAt(i) != dnaSequence2.charAt(i)) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }


    // Validation method to check if sequences are equal length and utilze valid characters
    public static void inputValidator(Scanner input, String dnaSequence1, String dnaSequence2) {
        
        while (dnaSequence1.length() != dnaSequence2.length()) {
            System.out.println("The sequences must match in length! Please try again: ");
            dnaSequence1 = input.nextLine();
            dnaSequence2 = input.nextLine();
        }

        for (int i = 0; i < dnaSequence1.length(); i++) {
            if (dnaSequence1.charAt(i) != 'A' && dnaSequence1.charAt(i) != 'C' && dnaSequence1.charAt(i) != 'G' && dnaSequence1.charAt(i) != 'T') {
                System.out.println("Invalid entry! Please enter a valid DNA sequence: ");
                dnaSequence1 = input.nextLine();
                dnaSequence2 = input.nextLine();
            }
        }

    }


    public static void main(String[] args) {

        // Initialize scanner and ask user for input    
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two DNA sequences of equal length: ");
        String dnaSequence1 = input.nextLine().toUpperCase();
        String dnaSequence2 = input.nextLine().toUpperCase();

      
        // Call validation method
        inputValidator(input, dnaSequence1, dnaSequence2);
        

        // Print results to user while calling the countHammingDistance method
        System.out.println("The Hamming distance between the two sequences is: " + countHammingDistance(dnaSequence1, dnaSequence2));

        
        input.close();

    }
}