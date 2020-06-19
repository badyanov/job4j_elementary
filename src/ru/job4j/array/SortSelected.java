package ru.job4j.array;

/**
 * 6.5.3. Сортировка выборкой.[#285604]
 * цикл доходит до предпоследнего элемента, так как тот заведомо будет максимальным
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        int lastIndex = data.length - 1;
        for (int i = 0; i <= (lastIndex - 1); i++) {
            int min = MinDiapason.findMin(data, i, lastIndex);
            int indexMin = FindLoop.indexOf(data, min, i, lastIndex);
            swap(data, i, indexMin);
        }
        return data;
    }

    static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
