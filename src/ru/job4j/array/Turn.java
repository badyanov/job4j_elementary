package ru.job4j.array;

/**
 * Цикл доходит до середины массива
 */
public class Turn {
    public int[] back(int[] array) {
        int lastIndex = array.length - 1;
        for (int i = 0; i <= lastIndex / 2; i++) {
            int temp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
        }
        return array;
    }
}
