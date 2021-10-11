/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */


package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class fileReader_WordbyWordTest {

    @Test
    void fileReaderWord() {

        BufferedReader readFile = null;

        // uploading file.  I am expecting the third word to be  "badger"
        ArrayList<String> fileContent = fileReader_WordbyWord.fileReaderWord(readFile, "exercise46_input.txt");
        String expected = "badger";
        String actual = fileContent.get(2);
        Assertions.assertTrue(actual.equals(expected));
    }
}