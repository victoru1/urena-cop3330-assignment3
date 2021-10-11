/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.util.*;

class WordFrequency_FinderTest {

    @Test
    void wordFrequencyMapCreator() {

        // upload text file.  check the frequency of some words

        BufferedReader readFile = null;
        ArrayList<String> fileContent = fileReader_WordbyWord.fileReaderWord(readFile, "exercise46_input.txt");
        Collections.sort(fileContent);


        Map< String, Integer> unsoretedMap =WordFrequency_Finder.wordFrequencyMapCreator(fileContent);

        // I expect the badger frequency to be 7, mushroom, 2 and snake 1


        int expectedFrequency1 = 7;
        int expectedFrequency2 = 2;
        int expectedFrequency3 = 1;

        int actualFrequency1 = unsoretedMap.get("badger");
        int actualFrequency2 = unsoretedMap.get("mushroom");
        int actualFrequency3 = unsoretedMap.get("snake");

        // checking to see if all three keys respond correctly with their corresponding expected frequencies

        boolean result = (actualFrequency1 == expectedFrequency1 && actualFrequency2 == expectedFrequency2 && actualFrequency3 == expectedFrequency3);
        Assertions.assertTrue(result);


    }


    @Test
    void sortMapsByValue() {

        // upload text file.  check the frequency of some words


        BufferedReader readFile = null;
        ArrayList<String> fileContent = fileReader_WordbyWord.fileReaderWord(readFile, "exercise46_input.txt");
        Collections.sort(fileContent);

        Map< String, Integer> unsoretedMap =WordFrequency_Finder.wordFrequencyMapCreator(fileContent);

        SortedSet<Map.Entry<String ,Integer>> sortedMap = WordFrequency_Finder.sortMapsByValue(unsoretedMap);

        // I expect the highest frequency to be 7 for the word badger and that to be the last word
        // I expect the lowest frequency to be 1 and since they will be alphabetically organized snake should come first

        int expectedFrequencyFirst = 1;
        String expectedWordFirst = "snake";

        int expectedFrequencyLast = 7;
        String expectedWord2Last= "badger";

        // get the first set of value map
        Map.Entry<String, Integer> value = sortedMap.first();

        String actualWordFirst = value.getKey();
        int actualFrequencyFirst = value.getValue();

        // get the last set of value map.
        Map.Entry<String, Integer> value2 = sortedMap.last();

        String actualWordLast = value2.getKey();
        int actualFrequencyLast = value2.getValue();



        boolean result = (expectedFrequencyFirst == actualFrequencyFirst && expectedFrequencyLast == actualFrequencyLast
                && expectedWordFirst.equals(actualWordFirst) && expectedWord2Last.equals(actualWordLast));
        Assertions.assertTrue(result);

    }
}