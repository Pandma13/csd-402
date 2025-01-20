// Megan Wheeler
// Assignment 3
// 19 January 2025

// Write a program that uses nested for loops to output all the following with the shown display format:
//                               
//               1                  @
//             1 2 1                @
//           1 2 4 2 1              @
//         1 2 4 8 4 2 1            @
//       1 2 4 8 16 8 4 2 1         @
//    1 2 4 8 16 32 16 8 4 2 1      @
// 1 2 4 8 16 32 64 32 16 8 4 2 1   @

// Do not forget to include the @ symbol.

public class PowerOfTwoTriangle {

    public static int column(int row) {
        return 2 * row - 1;
    }

    public static String space(int n) {
        return n > 0 ? " ".repeat(n) : "";
    }

    public static void main(String[] args) {
        int rows = 7;
        int[] powers = new int[rows +1];
        int maxRowWidth = 0;

        for (int power =0; power <= rows; power++) {
            powers[power] = (int) Math.pow(2, power);
        }

        for (int power =0; power < rows; power++) {
                maxRowWidth += String.valueOf(powers[power]).length() * 2;
        }

        maxRowWidth += String.valueOf(powers[rows - 1]).length() + (column(rows) -1);

        for (int row = 1; row <= rows; row++){
            int columns = column(row);
            int currentRowWidth = 0;

            for (int i = 0; i < row -1; i++) {
                currentRowWidth += String.valueOf(powers[i]).length() * 2;
            }
            currentRowWidth += String.valueOf(powers[row - 1]).length() + (columns -1);

            int middle = (maxRowWidth - currentRowWidth) / 2;
            int before = (int) Math.ceil(middle);
            int after = (int) (Math.floor(middle) + 1);

            System.out.print(space(before));

            for (int column = 1; column <= columns; column ++) {
                int power = column < row ? column - 1 : columns - column;
                System.out.print(powers[power]);

                if (column < columns) {
                    System.out.print(" ");
                }
            }

            System.out.print(space(after) + "@\n");
        }
    }
}