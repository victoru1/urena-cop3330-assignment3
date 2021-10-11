/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex42;

import java.util.ArrayList;
import java.util.Map;

public class PrintFile {

    static public void printTable(ArrayList<Map<String, String>> fileList) {

        System.out.print("Last\t\t\tFirst\t\t\tSalary\n");
        System.out.println("---------------------------------------");

        //print all employees in table format
        for (Map<String, String> stringStringMap : fileList) {
            System.out.printf(
                    "%-10s\t\t%-10s\t\t%-10s\n",
                    stringStringMap.get("lastName"),
                    stringStringMap.get("firstName"),
                    stringStringMap.get("salary")
            );
        }
    }
}
