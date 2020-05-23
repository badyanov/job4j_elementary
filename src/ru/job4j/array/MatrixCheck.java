package ru.job4j.array;

/**
 * Массивы
 */
public class MatrixCheck {

    /**
     * 6.7.1. Моно строка в матрице. [#285607]
     */
    public static boolean monoHorizontal(char[][] board, int row) {

        if (board.length <= row) {
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

    /**
     * 6.7.2. Моно столбец в матрице. [#285608]
     */
    public static boolean monoVertical(char[][] board, int column) {

        if (board.length <= column) {
            return false;
        }

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }


}
