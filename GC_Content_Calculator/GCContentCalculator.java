package GC_Content_Calculator;
import java.util.Scanner;


public class GCContentCalculator {
   
    // gcCalculator method to calculate the GC content of a DNA sequence
    public static void gcCalculator(String dnaSequence){
        // Convert to uppercase to ensure case sensitivity
        dnaSequence = dnaSequence.toUpperCase();

        // Initialize count at 0 
        int gcCount = 0;
        int totalCount = dnaSequence.length();

        // Count the number of G and C then throw IllegalArgumentException if not A, T, G, or C
        for (char nucleotide : dnaSequence.toCharArray()) {
            if (nucleotide == 'G' || nucleotide == 'C') {
                gcCount++;
            } else if (nucleotide != 'A' && nucleotide != 'T' && nucleotide != 'G' && nucleotide != 'C') {
                throw new IllegalArgumentException("Invalid DNA Sequence: contains characters other than A, C, G, or T");
            }
        }

        // calculate percentage
        double gcContent = (double) gcCount / totalCount * 100;
        
        // print out the result with 2 decimal places
        System.out.printf("The GC content of the DNA sequence is: %.2f%%\n", gcContent);

    }


    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        // Prompt user for dna sequence
        System.out.println("Enter a DNA sequence: ");
        String dnaSequence = newScanner.nextLine();

        // try catch block to handle invalid input on gcCalculator method
        try {
            gcCalculator(dnaSequence);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        newScanner.close();

    }

    
}
