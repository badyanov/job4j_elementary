package ru.job4j.sort;

import java.util.Arrays;

/**
 * Объединить два массива [#124482]
 */
public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int i = 0;

        // Сначала проходим оба массива и заполняем наименьшее из двух значений в новый массив
        // сдвигая при этом указатель на текущий элемент массива
        while (indexLeft < left.length && indexRight < right.length) {
            int buf = 0;
            if (left[indexLeft] < right[indexRight]) {
                buf = left[indexLeft];
                indexLeft++;
            } else {
                buf = right[indexRight];
                indexRight++;
            }
            rsl[i] = buf;
            i++;
        }

        // После того, как указатель одного из массивов дошел до последнего элемента,
        // нужно дозаполнить результирующий массив из второго
        if (indexLeft == left.length) {
            fillArray(rsl, right, i, indexRight);
        } else {
            fillArray(rsl, left, i, indexLeft);
        }

        return rsl;
    }

    private void fillArray(int[] rsl, int[] array, int indexRsl, int indexArray) {
        while (indexArray < array.length) {
            rsl[indexRsl] = array[indexArray];
            indexArray++;
            indexRsl++;
        }
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 8},
                new int[] {2, 6}
        );
        System.out.println(Arrays.toString(rsl));
    }
}