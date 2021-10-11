/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex42;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ReadFile {

    static public ArrayList<Map<String, String>> readFilesNames() throws IOException {

        ArrayList<Map<String, String>> fileList = new ArrayList<>();

        //takes file path
        String inputFilePath = new File("exercise42_input.txt").getAbsolutePath();
        File inputFile = new File(inputFilePath);

        //reads file
        Scanner reader = new Scanner(inputFile);

        //reads each line of the file
        while (reader.hasNextLine()) {

            //reads each character in current line
            Scanner readLine = new Scanner(reader.nextLine());

            //split the words when find a coma
            readLine.useDelimiter(",");

            //read each character of a line until next line
            while(readLine.hasNextLine()) {

                //initialize map everytime the loop runs
                Map<String, String> employee = new HashMap<>();

                //add info of each employee into map
                employee.put("lastName", readLine.next());
                employee.put("firstName", readLine.next());
                employee.put("salary", readLine.next());

                //add employee information into arrayList
                fileList.add(employee);
            }
        }
        return fileList;
    }
}
