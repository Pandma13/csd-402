// Megan Wheeler
// Assignment 5.2
// 31 January 2025

// Write methods using the following headers that returns the location of the largest
// element in the array passed to the method returning a one-dimensional array that
// contains two location elements.
// public static int [ ] locateLargest (double [ ][ ] arrayParam)
// public static int [ ] locateLargest (int [ ][ ] arrayParam)

// Then, write methods using the following headers that returns the location of the
// smallest element in the array passed to the method returning a one-dimensional array
// that contains two location elements.
// public static int [ ] locateSmallest (double [ ][ ] arrayParam)
// public static int [ ] locateSmallest (int [ ][ ] arrayParam)

public class ArrayElements {
    // Define methods to locate the largest element of the array passed to it
    // Method that takes double element arrays
    public static int[] locateLargest (double[][] arrayParam) {
        // Declare variables
        double largestDouble = arrayParam[0][0];
        int largestRowDouble = 0;
        int largestColumnDouble = 0;        

        // Determine location of largest element in array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestDouble) {
                    largestDouble = arrayParam[i][j];
                    largestRowDouble = i;
                    largestColumnDouble = j;
                }
            }
        }
        // Return array with location
        return new int[]{largestRowDouble, largestColumnDouble};
    }

    // Method that takes int element arrays
    public static int[] locateLargest (int[][] arrayParam) {
        // Declare variables
        int largestInt = arrayParam[0][0];
        int largestRowInt = 0;
        int largestColumnInt = 0;        

        // Determine location of largest element in array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestInt) {
                    largestInt = arrayParam[i][j];
                    largestRowInt = i;
                    largestColumnInt = j;
                }
            }
        }
        // Return array with location
        return new int[]{largestRowInt, largestColumnInt};
    }

    // Define methods to locate the smallest element of the array passed to it
    // Method that takes double element arrays
    public static int[] locateSmallest (double[][] arrayParam) {
        // Declare variables
        double smallestDouble = arrayParam[0][0];
        int smallestRowDouble = 0;
        int smallestColumnDouble = 0;        

        // Determine location of smallest element in array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestDouble) {
                    smallestDouble = arrayParam[i][j];
                    smallestRowDouble = i;
                    smallestColumnDouble = j;
                }
            }
        }
        // Return array with location
        return new int[]{smallestRowDouble, smallestColumnDouble};
    }

    // Method that takes int element arrays
    public static int[] locateSmallest (int[][] arrayParam) {
        // Declare variables
        int smallestInt = arrayParam[0][0];
        int smallestRowInt = 0;
        int smallestColumnInt = 0;        

        // Determine location of smallest element in array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestInt) {
                    smallestInt = arrayParam[i][j];
                    smallestRowInt = i;
                    smallestColumnInt = j;
                }
            }
        }
        // Return array with location
        return new int[]{smallestRowInt, smallestColumnInt};        
    }
    
    public static void main(String[] args) {
        // Declare and populate double array and int array
        double doubleArray[][] = {{214.894, 1.549, 2.2}, {576.1, 84.05, 16.8, 246.3}};
        int intArray[][] = {{300, 8467, 5, 29, 618}, {37, 20, 18376, 1094}};

        // Method calls
        int largestDoubleLocation[] = locateLargest(doubleArray);
        int largestIntLocation[] = locateLargest(intArray);
        int smallestDoubleLocation[] = locateSmallest(doubleArray);
        int smallestIntLocation[] = locateSmallest(intArray);

        // Print results to the user
        System.out.println("The largest double array element is located at: " + "(" + largestDoubleLocation[0] + ", " + largestDoubleLocation[1] + ")");
        System.out.println("The largest int array element is located at: " + "(" + largestIntLocation[0] + ", " + largestIntLocation[1] + ")");
        System.out.println("The smallest double array element is located at: " + "(" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + ")");
        System.out.println("The smallest int array element is located at: " + "(" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + ")");
    }
}