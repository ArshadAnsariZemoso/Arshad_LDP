package com.assignment.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FileSearchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File Search App - Enter a regular expression to search:");
        String regex = scanner.nextLine(); // Read the regular expression from user

        while (!regex.equalsIgnoreCase("exit")) {
            searchFiles(regex);
            
            System.out.println("\nEnter another regular expression to search (or 'exit' to quit):");
            regex = scanner.nextLine();
        }

        System.out.println("File Search App - Exiting.");
        scanner.close();
    }

    /**
     * Search for files in the home directory and its subdirectories that match the given regular expression.
     *
     * @param regex The regular expression to search for.
     */
    public static void searchFiles(String regex) {
        String homeDirectory = System.getProperty("user.home");
        File directory = new File(homeDirectory);
        
        // Create a regular expression pattern object
        Pattern pattern = Pattern.compile(regex);

        searchInDirectory(directory, pattern);
    }

    /**
     * Recursive method to search for files in a directory and its subdirectories.
     *
     * @param directory The directory to search in.
     * @param pattern   The regular expression pattern to match against.
     */
    public static void searchInDirectory(File directory, Pattern pattern) {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                searchInDirectory(file, pattern); // Recursively search subdirectories
            } else {
                String fileName = file.getName();
                Matcher matcher = pattern.matcher(fileName);
                
                if (matcher.matches()) {
                    System.out.println("Matching file found: " + file.getAbsolutePath());
                }
            }
        }
    }
}
