/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex41;

import java.io.*;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

public class Name_Sorter {
    public static BufferedReader readFile=null;
    public static BufferedWriter writeFile=null;

    public static void main(String[] args) {

        //step 1: create two file references (in and out)
        //step 2: create read method
        //step 3: pass reference to a read method along with file name (passing file name helps with testability)
        //step 4: store the data inside a string array
        //step 5: return string to main
        //step 6: use collection method to sort
        //step 7: take the string from step 6
        //step 8: pass the string, name of file and output file pointer to a file writer
        //step 9: need to get  num of strings(aka num of names) by checking on string length in the file writer
        //step 10: return the output pointer to ensure it is no longer NULL and file was created.  helps wth testing




        ArrayList<String> fileLines = fileRead(readFile, "exercise41_input.txt");

        Collections.sort(fileLines);

        writeFile = fileWriter(writeFile, fileLines,"exercise41_output.txt");


    }



    public static ArrayList<String> fileRead(BufferedReader inputFile, String fileName) {

        // created an array list of strings which each string contains a line of the file

        ArrayList<String> fileLines = new ArrayList<>();

        try {
            inputFile = new BufferedReader(new FileReader(fileName));

            String eachLines = inputFile.readLine();

            while (eachLines != null)
            {
                fileLines.add(eachLines);

                eachLines = inputFile.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try
            {
                if (inputFile != null)
                {
                    inputFile.close();
                }

            } catch (IOException e)
            {
                e.printStackTrace();
            }


        }




        return fileLines;
    }

    public static BufferedWriter fileWriter(BufferedWriter outputFile, ArrayList<String> sortedString, String fileName){


        //create and write on a new file

        try {
            outputFile = new BufferedWriter(new FileWriter(fileName));

            // get num of lines for the firs print line
            int numOfLines = sortedString.size();

            outputFile.write("Total of " + numOfLines + " names\n-----------------\n");

            for (String eachline : sortedString)
            {
                outputFile.write(eachline);

                outputFile.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try
            {
                if (outputFile != null)
                {
                    outputFile.close();
                }

            } catch (IOException e)
            {
                e.printStackTrace();
            }


        }


        return outputFile;

    }

}

