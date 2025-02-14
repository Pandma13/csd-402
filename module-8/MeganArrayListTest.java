/* Megan Wheeler
* Assignment 8
* 13 February 2025
*
* Follow the directions below:
*
* Create a class [yourName]ArrayListTest .
*
* This class is to contain:
*
* 1. A method that receives an ArrayList populated with an Integer data type
*       holding the integers received from user input.
* 2. The user input is to accept Integers that are then assigned to the ArrayList
*       until a value of 0 is entered, which is also assigned to the ArrayList.
* 3. The ArrayList is then to be sent to the method.
* 4. The method is then to return the largest value in the ArrayList.
* 5. If the ArrayList is sent in empty, the method will then return 0.
* 6. The method signature is to be public static Integer max (ArrayList list).
* 7. Write additional code for testing your method.
* 8. The method will return the largest value that is displayed to the user.
*/

import java.util.*;

public class MeganArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        // state largestInteger variable
        int largestInteger = 0;

        // for loop to find the largest integer in the ArrayList
        for (int i = 0; i < list.size(); i++) {
            // check if the index is smaller than the current value of i
            if (list.get(i) > largestInteger) {
                largestInteger = list.get(i);
            }
        }
        // return the largest integer to the main method
        return largestInteger;
    }

    public static void main(String[] args) {
        // create ArrayList
        ArrayList<Integer> arrList = new ArrayList<> ();
        // create Scanner object
        try (Scanner myScanner = new Scanner(System.in)) {
            myScanner.useDelimiter("\\s");
            // ask user for input
            System.out.println("Enter a whole number: ");
            
            // create user input variable
            int userInput;

            // while loop to get input from the user 
            while (true) {
                try {userInput = myScanner.nextInt();} catch (InputMismatchException e) {userInput = 0;}
                System.out.println(userInput);
                // add input from user into ArrayList
                arrList.add(userInput);

                // stop asking for user input and add 0 to the ArrayList
                if (userInput == 0) {
                    break;
                }
            }
        }

        // Call max method and pass in the ArrayList
        int maxInt = max(arrList);

        // Print the max integer in the ArrayList
        System.out.println("The largest integer in the array is " + maxInt + ".");
    }
}