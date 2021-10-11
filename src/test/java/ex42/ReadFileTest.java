/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFilesNames() throws IOException {
        ArrayList<Map<String, String>> testOutput = new ArrayList<>();

        Map<String, String> employee1 = new HashMap<>();
        Map<String, String> employee2 = new HashMap<>();
        Map<String, String> employee3 = new HashMap<>();
        Map<String, String> employee4 = new HashMap<>();
        Map<String, String> employee5 = new HashMap<>();
        Map<String, String> employee6 = new HashMap<>();
        Map<String, String> employee7 = new HashMap<>();

        employee1.put("lastName", "Ling");
        employee1.put("firstName", "Mai");
        employee1.put("salary", "55900");
        testOutput.add(0,employee1);

        employee2.put("lastName", "Johnson");
        employee2.put("firstName", "Jim");
        employee2.put("salary", "56500");
        testOutput.add(1,employee2);

        employee3.put("lastName", "Jones");
        employee3.put("firstName", "Aaron");
        employee3.put("salary", "46000");
        testOutput.add(2,employee3);

        employee4.put("lastName", "Jones");
        employee4.put("firstName", "Chris");
        employee4.put("salary", "34500");
        testOutput.add(3,employee4);

        employee5.put("lastName", "Swift");
        employee5.put("firstName", "Geoffrey");
        employee5.put("salary", "14200");
        testOutput.add(4,employee5);

        employee6.put("lastName", "Xiong");
        employee6.put("firstName", "Fong");
        employee6.put("salary", "65000");
        testOutput.add(5,employee6);

        employee7.put("lastName", "Zarnecki");
        employee7.put("firstName", "Sabrina");
        employee7.put("salary", "51500");
        testOutput.add(6,employee7);

        assertEquals(testOutput, ReadFile.readFilesNames());
    }
}