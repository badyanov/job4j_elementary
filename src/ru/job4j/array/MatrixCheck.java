package ru.job4j.array;

/**
 * 6.7.1. Моно строка в матрице. [#285607]
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {

        if (board.length < row) {
            return false;
        }

        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                result = false;
                break;
            }
        }

        return result;

    }
}
