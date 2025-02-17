// Megan Wheeler
// Assignment 9 part 2
// 15 February 2025

// Program 2:
// 1. Write a program to create a new file titled data.file, if the file does not exist.
// 2. Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly
//     generated numbers to a previous file.
// 3. Each integer is to be separated by a space.
// 4. Close the file, then reopen the file and read the data from the file and display it.

import java.io.*;
import java.util.Scanner;

public class MyNewFile{
    public static void main(String[] args){
        File thisFile;
        PrintWriter thisWriter;
        Scanner thisReader;

        // try-catch to create file and check if the file already exists
        // try-catch to write to or append the new file with random numbers
        try {
            thisFile = new File("data.file");

            if (thisFile.exists()) {
                System.out.println("This file already exists.");
                thisWriter = new PrintWriter(thisFile);
                for (int i = 0; i < 10; i++) {
                    thisWriter.append((int)((Math.random() * 100) + 1) + " ");
                }
            } else {        
                thisWriter = new PrintWriter(thisFile);
                System.out.println("New file " + thisFile.getName() + " was created.");

                for (int i = 0; i < 10; i++) {
                    thisWriter.write((int)((Math.random() * 100) + 1) + " ");
                }
            }
        thisWriter.close();
            
        } catch (IOException e) {
            System.out.println("Oops! The first IOException was thrown.");
        }

        try {
            thisFile = new File("data.file");
            thisReader = new Scanner(thisFile);

            while(thisReader.hasNext()) {
                Integer fileData = thisReader.nextInt();
                System.out.print(fileData + " ");
            }
            thisReader.close();

        } catch (IOException e) {
            System.out.println("Oops! The second IOException was thrown.");
        }
    }
}