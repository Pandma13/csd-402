// Megan Wheeler
// Assignment 4.2
// 24 January 2025

// Write four overloaded methods that return the average of an array with
// the following headers:

// public static short average (short [ ] array)
// public static int average (int [ ] array)
// public static long average (long [ ] array)
// public static double average (double [ ] array)

// Write a test program that invokes each of these methods and then displays
// the average value returned along with a display of the original array elements.
// Ensure the display is easy to read and understandable.
// Lastly, each array sent into the methods must be of different sizes to ensure
// the method code is correctly written.

public class ArrayMethodOverload {
    // Overloaded short method
    public static short average(short[] array) {
        // declare variables
        int sum = 0;
        int count = array.length;
        short avg;

        // Calculate sum of array elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate and return array element average
        avg = (short) (sum/count);
        return avg;
    }

    // Overloaded int method
    public static int average(int[] array) {
        // declare variables
        int sum = 0;
        int count = array.length;
        int avg;

        // Calculate sum of array elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate and return array element average
        avg = sum/count;
        return avg;
    }

    // Overloaded long method
    public static long average(long[] array) {
        // declare variables
        long sum = 0;
        long count = (long)array.length;
        long avg;

        // Calculate sum of array elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate and return array element average
        avg = (long) (sum/count);
        return avg;
    }

    // Overloaded double method
    public static double average(double[] array) {
        // declare variables
        double sum = 0;
        double count = (double)array.length;
        double avg;

        // Calculate sum of array elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate and return array element average
        avg = (double) (sum/count);
        return avg;
    }
}