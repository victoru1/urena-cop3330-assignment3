/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fileReader_WordbyWord {
    public static ArrayList<String> fileReaderWord (BufferedReader inputFile, String fileName) {

        ArrayList<String> fileLines = new ArrayList<>();
        String[] wordsInLine;


        try {
            inputFile = new BufferedReader(new FileReader(fileName));

            String eachLines = inputFile.readLine();


            while (eachLines != null)
            {
                wordsInLine = eachLines.split(" ");

                for(int i=0; i<wordsInLine.length; i++)
                    fileLines.add(wordsInLine[i]);

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
}
