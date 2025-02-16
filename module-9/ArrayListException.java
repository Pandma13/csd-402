// Megan Wheeler
// Assignment 9 part 1
// 15 February 2025

// Program 1:
// 1. Write a program that uses an ArrayList filled with a minimum
//     of 10 Strings. Use a ‘for-each’ loop to print the ArrayList collection.
// 2. Then ask a user which element they would like to see again.
// 3. Then, attempt printing the element in a try/catch format which will result
//     in the element being displayed.
// 4. If the element value received is invalid, display a message that an
//     Exception has been thrown displaying “Out of Bounds”.
// 5. In this program, include the use of Auto-boxing/Auto-Unboxing (automatic
//     conversion from primitive types to their object wrapper classes), working
//     with a user String input.

import java.util.*;

public class ArrayListException {

    public static void main(String[] args) {
        // create an arraylist with 10 initial string elements
        ArrayList<String> arrList = new ArrayList<> (10);

        // add strings to arraylist
        arrList.add("Hedgehog");
        arrList.add("Bat");
        arrList.add("Hippopotamus");
        arrList.add("Otter");
        arrList.add("Peacock");
        arrList.add("Racoon");
        arrList.add("Elephant");
        arrList.add("Llama");
        arrList.add("Albatross");
        arrList.add("Cheetah");
        arrList.add("Arctic Fox");
        arrList.add("Giant Panda");
        arrList.add("Lizard");
        arrList.add("Octopus");
        arrList.add("Chameleon");

        // print elements of arraylist
        for (String a : arrList) {
            System.out.println(a);
        }
        
        // create Scanner object
        try (Scanner myScanner = new Scanner(System.in)) {
            // ask user for input
            System.out.println("Which element would you like to see again(0-14): ");

            // while loop to get user input and then use try/catch for exceptions
            while (true) {
                try {
                    // create variable for user input
                    int userInput = myScanner.nextInt();
                    if (userInput >= 0 && userInput < arrList.size())
                        System.out.println(arrList.get(userInput));
                    else throw new IndexOutOfBoundsException();                                 
                }
                catch (InputMismatchException | IndexOutOfBoundsException e) {
                    System.out.println("An Exception has been thrown displaying Out of Bounds");
                    break;
                }
            } 
        }
    }
}