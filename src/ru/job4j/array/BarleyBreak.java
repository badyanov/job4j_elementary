package ru.job4j.array;

/**
 * 6.6.1. Двухмерный массив. Вывод на консоль.[#285616]
 */
public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[y][x] = (x + 1) + (y * 3);
            }
        }
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[y][x] + "\t");
            }
            System.out.println();
        }
    }
}
