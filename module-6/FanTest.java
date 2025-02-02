// Megan Wheeler
// Assignment 6.2
// 1 February 2025

// Follow the directions below:
// Write a program with a class titled Fan. This class is to contain:
// 1. Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the
// values of 0, 1, 2, and 3 respectively. 
// 2. A private field named speed that holds one of the constant values with the default
// being STOPPED. 
// 3. A private Boolean field titled on that specifies whether the fan is on or off. 
// 4. A private field named radius that holds the radius of the fan with a default value of 6. 
// 5. A String field that holds the color, with the default being white. 
// 6. Setter and getter methods for all mutable fields. 
// 7. A no-argument constructor that sets all fields with a default value. 
// 8. A constructor takes arguments and sets values. 
// 9. Write a toString() method that returns a description of the Fans state.

// 10. Write test code that creates two instances of the Fan class, one using the default
// constructor and the other using the argument constructor. Write code that displays
// the functionality of the Fan class methods.

public class FanTest {
    public static void main(String[] args) {
        // Create instance of default Fan class
        Fan defFan = new Fan();
        // Create instance of argument Fan class
        Fan argFan = new Fan(2, true, 5, "pink");

        // Test instances of the Fan class
        Fan testFanOne = new Fan(3, false, 3, "green");
        Fan testFanTwo = new Fan(0, true, 5, "blue");
        Fan testFanThree = new Fan(6, true, 7, "yellow");


        // Display the functionality of the Fan class methods
        System.out.println(defFan);
        defFan.toString();

        System.out.println(argFan);
        argFan.toString();

        // Display the functionality of first test of the Fan class
        System.out.println(testFanOne);
        testFanOne.toString();

        // Display the functionality of the second test of the Fan class
        System.out.println(testFanTwo);
        testFanTwo.toString();

        // Display the functionality of the third test of the Fan class
        System.out.println(testFanThree);
        testFanThree.toString();
    }
}