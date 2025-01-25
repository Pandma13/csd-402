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
// import org.junit.Assert;
// import org.junit.Test;
import java.util.Arrays;

public class ArrayMethodOverloadTest {
    public static void main(String[] args) {
        // Assign values to arrays and create instance of array with those values
        short[] shortArray = {58, 900, 30000, 2864, 378};
        ArrayMethodOverload.average(shortArray);
        int[] intArray = {500000, 99678, 34607};
        ArrayMethodOverload.average(intArray);
        long[] longArray = {3000000000L, 99060780600L, 34607L, 10L};
        ArrayMethodOverload.average(longArray);
        double[] doubleArray = {375.84, 8.7, 94806.50, 579.0, 17.0008, 1385947.66772159};
        ArrayMethodOverload.average(doubleArray);

        // Remove comments to run test.

        // // Test for an empty array. CAUSES ERROR.
        // int[] emptyArray = {};
        // ArrayMethodOverload.average(emptyArray);

        // // Test for an array with negative elements.
        // int[] negativeArray = {-25, -800, -6790};
        // ArrayMethodOverload.average(negativeArray);

        // // Test for an array with single element.
        // int[] singleArray = {250};
        // ArrayMethodOverload.average(singleArray);

        // // Test for an array with an element of zero. Causes error.
        // int[] zeroArray = {0, 0};
        // ArrayMethodOverload.average(zeroArray);

        // // Test for an array with sum of zero.
        // int[] zeroSumArray = {678, -78, 50, -650};
        // ArrayMethodOverload.average(zeroSumArray);

        // Print average of array and contents of array.
        System.out.print("short average: " + ArrayMethodOverload.average(shortArray));
        System.out.println(" ");
        System.out.print("short array contents: " + (Arrays.toString(shortArray)));
        System.out.println(" ");

        System.out.print("int average: " + ArrayMethodOverload.average(intArray));
        System.out.println(" ");
        System.out.print("int array contents: " + (Arrays.toString(intArray)));
        System.out.println(" ");

        System.out.print("long average: " + ArrayMethodOverload.average(longArray));
        System.out.println(" ");
        System.out.print("long array contents: " + (Arrays.toString(longArray)));
        System.out.println(" ");

        System.out.print("double average: " + ArrayMethodOverload.average(doubleArray));
        System.out.println(" ");
        System.out.print("double array contents: " + (Arrays.toString(doubleArray)));
        System.out.println(" ");

        // Remove comments to run test.

        // // Test printing for empty array.
        // System.out.print("empty average: " + ArrayMethodOverload.average(emptyArray));
        // System.out.println(" ");
        // System.out.print("empty array contents: " + (Arrays.toString(emptyArray)));
        // System.out.println(" ");

        // // Test printing for negative element array.
        // System.out.print("negative average: " + ArrayMethodOverload.average(negativeArray));
        // System.out.println(" ");
        // System.out.print("negative array contents: " + (Arrays.toString(negativeArray)));
        // System.out.println(" ");

        // // Test printing for single element array.
        // System.out.print("single average: " + ArrayMethodOverload.average(singleArray));
        // System.out.println(" ");
        // System.out.print("single array contents: " + (Arrays.toString(singleArray)));
        // System.out.println(" ");

        // // Test printing for zero element array.
        // System.out.print("zero average: " + ArrayMethodOverload.average(zeroArray));
        // System.out.println(" ");
        // System.out.print("zero array contents: " + (Arrays.toString(zeroArray)));
        // System.out.println(" ");

        // // Test printing for single element array.
        // System.out.print("zero sum average: " + ArrayMethodOverload.average(zeroSumArray));
        // System.out.println(" ");
        // System.out.print("zero sum array contents: " + (Arrays.toString(zeroSumArray)));
        // System.out.println(" ");
    }
}