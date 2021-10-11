/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex45;

import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        // Prompt user for output file name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the output file: ");
        String outputFilename = scanner.nextLine().trim();

        // Initialize FileOps
        FileOps fileOperations = new FileOps("exercise45_input.txt", outputFilename);
        // Read input file
        String inputFileContents = fileOperations.readFile();
        // Replace utilize with use
        String newContents = replaceWordInString(inputFileContents, "utilize", "use");
        // Write new string to the output file
        fileOperations.writeFile(newContents);
    }

    public static String replaceWordInString(String input, String wordToReplace, String replacementWord) {
        return input.replace(wordToReplace, replacementWord);
    }
}
