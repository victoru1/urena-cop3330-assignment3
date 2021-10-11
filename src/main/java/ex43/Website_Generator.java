/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Victor Urena
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Website_Generator {

    private static Scanner input = new Scanner(System.in);
    private static FileWriter htmlFile = null;

    public static void main(String[] args) {


        ArrayList<String> websiteData = getWebsiteData();
        pathMaker(websiteData);


    }



    public static ArrayList<String> getWebsiteData() {


        ArrayList<String> websiteData = new ArrayList<>();

        System.out.print("Site name: ");
        websiteData.add(input.nextLine());

        System.out.print("Author: ");
        websiteData.add(input.nextLine());


        System.out.print("Do you want a folder for JavaScript?: ");
        websiteData.add(input.nextLine());


        System.out.print("Do you want a folder for CSS?: ");
        websiteData.add(input.nextLine());

        return websiteData;


    }


    public static void pathMaker(ArrayList<String> websiteData) {


        String sourceDirectory = "src/main/java/ex43/";

        File folder = folderCreator(sourceDirectory, "website");



        for (int i = 0; i < websiteData.size(); i++) {

            switch (i) {

                case 0:
                    folder = folderCreator(sourceDirectory, "website", websiteData.get(i));
                    printFileCreationResult(folder);
                    sourceDirectory += "//website";

                    break;

                case 1:
                    htmlFile = htmlMaker(htmlFile, websiteData, (sourceDirectory + "//" + websiteData.get(0) + "//index.html") );
                    printhtmlCreationResult(htmlFile, (sourceDirectory + "//" + websiteData.get(0) + "//index.html") );
                    break;
                case 2:
                    if (websiteData.get(i).equals("y")) {
                        folder = folderCreator(sourceDirectory, websiteData.get(0), "js");
                        printFileCreationResult(folder);
                    }
                    break;
                case 3:
                    if (websiteData.get(i).equals("y")) {
                        folder = folderCreator(sourceDirectory, websiteData.get(0), "css");
                        printFileCreationResult(folder);
                    }
                    break;


            }


        }


    }


    public static File folderCreator(String sourceDirectory, String folderName) {

        // creating a file in current path
        // return file reference to check if the file was created and get its location

        sourceDirectory += ("//" + folderName);

        File file = new File(sourceDirectory);


        return file;
    }

    public static File folderCreator(String sourceDirectory, String folderName, String subFolderName) {

        //method overloading for sub-folders


        sourceDirectory += ("//" + folderName + "//" + subFolderName);
        File file = new File(sourceDirectory);


        return file;
    }


    public static void printFileCreationResult(File folder) {

        //method checks if the file was successfully created.
        //if yes prints the path
        //if no prints an error massage

        boolean fileCreated = (folder.mkdirs());

        if (fileCreated) {

            System.out.println("Created " + folder.getAbsolutePath());

        } else {
            System.out.println("Failed to create directory!");
        }
    }

    public static void printhtmlCreationResult(FileWriter outputFile, String path) {

        //method checks if the file was successfully created.
        //if yes prints the path
        //if no prints an error massage

        //boolean fileCreated = ();

        if (outputFile != null ) {

            File f = new File(path);

            System.out.println("Created " + f.getAbsolutePath());


        } else {
            System.out.println("Failed to create directory!");
        }
    }


    public static FileWriter htmlMaker(FileWriter outputFile, ArrayList<String> websiteData, String path) {


        try {
            outputFile = new FileWriter(path);


            outputFile.write("       <!DOCTYPE html>\n<html>\n<head>\n<title>" + websiteData.get(0) + "</title>\n" +

                    "  <meta name=\"Author\" content=\"" + websiteData.get(1) + "\">\n" +
                    "</head>");


        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (outputFile != null) {
                    outputFile.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return outputFile;
    }

}