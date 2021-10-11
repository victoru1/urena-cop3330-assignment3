/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Name_SorterTest {
    BufferedReader readFile = null;
    BufferedWriter writeFile = null;

    Name_SorterTest() {
    }

    @Test

        // uploading file.  I am expecting the first line to be  "Ling, Mai"
    void fileReader() {
        ArrayList<String> fileLines = Name_Sorter.fileRead(this.readFile, "exercise41_input.txt");
        String expected = "Ling, Mai";
        String actual = (String)fileLines.get(0);
        Assertions.assertTrue(actual.equals(expected));
    }

    @Test
    void fileWriter() {
        // making sure the pointer to output file is created and no longer NULL (file was created successfully)


        ArrayList<String> fileLines = Name_Sorter.fileRead(this.readFile, "exercise41_input.txt");
        Collections.sort(fileLines);
        this.writeFile = Name_Sorter.fileWriter(this.writeFile, fileLines, "exercise41_output.txt");
        boolean actualOutput = this.writeFile != null;
        Assertions.assertTrue(actualOutput);
    }
}