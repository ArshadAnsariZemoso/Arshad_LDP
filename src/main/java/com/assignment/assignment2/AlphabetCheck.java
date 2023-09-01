package com.assignment.assignment2;
public class AlphabetCheck {
    public static boolean containsAllAlphabet(String input) {
        boolean[] alphabetFound = new boolean[26]; // To track if each letter is found
        
        // Convert input to lowercase to make the check case-insensitive
        String lowerInput = input.toLowerCase();
        
        for (char c : lowerInput.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                alphabetFound[c - 'a'] = true;
            }
        }
        
        for (boolean found : alphabetFound) {
            if (!found) {
                return false; // If any letter is missing, return false
            }
        }
        
        return true; // All letters are found
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = containsAllAlphabet(input);
        
        if (result) {
            System.out.println("Input contains all alphabet letters.");
        } else {
            System.out.println("Input does not contain all alphabet letters.");
        }
    }
}
