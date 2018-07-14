package ru.job4j.array;

public class Ediltest {

    public static void main(String[] args) {

        boolean[][] matrix = {{true,  false, true,  true,  true},
                                {true,  true, true,  true, false},
                                {false, false, true,  true,  false},
                                {true,  true, false, true,  false},
                                {true, false, true,  false, false}
        };


        boolean isMatrixAllTrue = findTrueDiagonal(matrix);

        System.out.println("\nIs our matrix Diagonal all TRUE: " + isMatrixAllTrue);

    }

    static boolean findTrueDiagonal(boolean[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // 1 and 2 Diagonal
                if ((i == j) || // condition for Diagonal #1
                        ((i + j) == (matrix.length - 1)) // condition for Diagonal #2
                        ) {
                    boolean result = matrix[i][j];

                    System.out.println("index: " + i + "," + j + " | value: " + result);

                    if (result == false) {
                        return false;
                    }
                }

            }
        }

        return true;
    }
}
