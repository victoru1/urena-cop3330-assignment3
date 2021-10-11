/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex42;

import ex42.ReadFile;
import ex42.PrintFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class App {
    static ArrayList<Map<String, String>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        list = ReadFile.readFilesNames();
        PrintFile.printTable(list);
    }
}