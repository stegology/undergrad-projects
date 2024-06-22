# Developer: Stephanie LaBruna
# Date: February 19, 2024

# This program will calculate the GC content of a DNA sequence
#   Calculates the amount of times 'G' or 'C' appears in a string
#   Provides the percentage of the total string

#       Ex. GATC
#       GC-content = 50%

#---------------------------------------------------------------------

# Defines and prints the weclome message
def welcome_message():
    print("Hello! This program will calculate the GC-content of a given DNA sequence")

#---------------------------------------------------------------------

def gc_content_calculator(dna_sequence):
    count = 0   # Initialize count

    # Iterate over each base in the sequence
    for nucleotide in dna_sequence:
        if nucleotide in ['C', 'G']:    # Check if the base is C or G
            count += 1                  # Increment the count for each C or G found

    gc_content = (count / len(dna_sequence)) * 100  # Calculate GC-content percentage
    return gc_content

#---------------------------------------------------------------------

# Main Function

def main():
    # Display the welcome message
    welcome_message()

    # Loop until valid input is received
    while True:
        # Prompts the user for DNA sequence input
        dna_sequence = input("Please input the DNA sequence: ").upper()

        # Define validation variables
        allowable_letters = ['A', 'T', 'C', 'G']

        # Check if every character in the DNA sequence is valid
        if all(char in allowable_letters for char in dna_sequence):
            # If input is valid, break the loop
            break
        else:
            # If input is invalid, inform the user and continue the loop
            print("Error! Please input a valid DNA sequence (A, T, C, G")

    # Run function to calculate gc content percentage
    gc_content = gc_content_calculator(dna_sequence)

    # Print the results
    print(f"The GC-content is: {gc_content:.2f}%") # Formats to 2 decimal places

#---------------------------------------------------------------------

# Execute code
main() 
    
    
