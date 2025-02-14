// Megan Wheeler
// Assignment 8
// 13 February 2025

// Test cases for MeganArrayListTest.java

import java.util.*;

public class MeganArrayListTestTest {

    public static void main(String[] args) {
         // create Test instances of ArrayLists
          ArrayList<Integer> testList1 = new ArrayList<> (); // two matching max integers
          ArrayList<Integer> testList2 = new ArrayList<> (); // only zero
          ArrayList<Integer> testList3 = new ArrayList<> (); // negative integers
          ArrayList<Integer> testList4 = new ArrayList<> (); // two matching min integers
          ArrayList<Integer> testList5 = new ArrayList<> (); // multiple of the same integer

          // Add integers to testList1
          testList1.add(500);
          testList1.add(8597);
          testList1.add(8);
          testList1.add(8597);
          testList1.add(0);

          // Add integers to testList2
          testList2.add(0);

          // Add integers to testList3
          testList3.add(-549);
          testList3.add(-6);
          testList3.add(-81);
          testList3.add(-90);
          testList3.add(-500);
          testList3.add(-4673);
          testList3.add(-23);
          testList3.add(0);

          // Add integers to testList4
          testList4.add(5);
          testList4.add(384);
          testList4.add(90);
          testList4.add(5);
          testList4.add(5);
          testList4.add(0);

          // Add integers to testList5
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(72);
          testList5.add(0);

          // Call the max method and assign the results to test int variables
          int maxTestInt1 = MeganArrayListTest.max(testList1);
          int maxTestInt2 = MeganArrayListTest.max(testList2);
          int maxTestInt3 = MeganArrayListTest.max(testList3);
          int maxTestInt4 = MeganArrayListTest.max(testList4);
          int maxTestInt5 = MeganArrayListTest.max(testList5);

          // Display functionality of the MeganArrayListTest.max methods
          System.out.println("Test 1 results: " + maxTestInt1);
          System.out.println("Test 1 ArrayList: " + testList1.toString());

          System.out.println("Test 2 results: " + maxTestInt2);
          System.out.println("Test 2 ArrayList: " + testList2.toString());

          System.out.println("Test 3 results: " + maxTestInt3);
          System.out.println("Test 3 ArrayList: " + testList3.toString());

          System.out.println("Test 4 results: " + maxTestInt4);
          System.out.println("Test 4 ArrayList: " + testList4.toString());

          System.out.println("Test 5 results: " + maxTestInt5);
          System.out.println("Test 5 ArrayList: " + testList5.toString());
     }
}