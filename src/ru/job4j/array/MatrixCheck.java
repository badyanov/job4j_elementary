package ru.job4j.array;

/**
 * Массивы
 */
public class MatrixCheck {

    /**
     * 6.7.1. Моно строка в матрице. [#285607]
     */
    public static boolean monoHorizontal(char[][] board, int row) {

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

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * 6.7.3. Массив из диагонали матрицы. [#285609]
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * 6.7.4. Выигрышные комбинации в сокобан [#285600]
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                result = (monoHorizontal(board, index) || monoVertical(board, index));
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}
