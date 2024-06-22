# Developer: Stephanie LaBruna
# Date: February 19, 2024

# This program will prompt a user to input a string representing a segment of DNA ('AACAAGTGATCAAACTGAC')
# Output: RNA sequence of that string

#   Input:  TAGC
#   Output: AUCG

#---------------------------------------------------------------------

# Defines and prints the welcome message
def welcome_message():
    print("Hello! This is a simple DNA to RNA sequence converter.") 
    

#---------------------------------------------------------------------

# Function to change letters:
# T to A
# A to U
# G to C
# C to G


def dna_to_rna(dna_sequence):
    # Convert input to uppercase
    dna_sequence = dna_sequence.upper()
    
    # Replace all original nucleotides with placeholders
    rna_sequence = (dna_sequence.replace('A', 'w')  # Placeholder for A to U 
                                .replace('T', 'x')  # Placeholder for T to A
                                .replace('G', 'y')  # Placeholder for G to C
                                .replace('C', 'z')) # Plaveholder for C to G
                    
    # Replace placeholders with the target RNA nucleotides
    rna_sequence = (rna_sequence.replace('w', 'U')  # Replace A to U
                                .replace('x', 'A')  # Replace T to A
                                .replace('y', 'C')  # Replace G to C
                                .replace('z', 'G')) # Replace C to G
    return rna_sequence


#---------------------------------------------------------------------

# Main Function

def main():
    # Displays the welcome message
    welcome_message()
    
    
    # Loop until valid input is received
    while True:
        # Prompts the user for DNA sequence input
        dna_sequence = input("Please enter the DNA Sequence: ").upper()

        # Define validation variables
        allowable_letters = ['A', 'T', 'C', 'G']
        
        # Check if every character in the DNA sequence is valid
        if all(char in allowable_letters for char in dna_sequence):
            # If input is valid, break the loop
            break
        else:
            # If input is invalid, inform the user and continue the loop
            print("Error! Please input a valid DNA sequence (A, T, C, G).")
    

    # Convert the DNA sequence to RNA sequence
    rna_sequence = dna_to_rna(dna_sequence)

    # Print the resulting RNA sequence
    print("DNA Sequence:", dna_sequence)
    print("RNA Sequence:", rna_sequence)

#---------------------------------------------------------------------

# Execute code
main()
