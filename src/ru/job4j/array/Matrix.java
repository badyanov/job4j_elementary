package ru.job4j.array;

/**
 * 6.6.2. Двухмерный массив. Таблица умножения. [#285597]
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
