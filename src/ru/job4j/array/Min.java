package ru.job4j.array;

/**
 * 6.5.1. Поиск минимального числа в массиве.[#285605]
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
