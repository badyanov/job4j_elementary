package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int lastIndex = array.length - 1;

        for (int i = 0; i <= lastIndex; i++) {
            // когда индекс начального элемента становится больше индекса конечного, выходим из цикла
            if (i > lastIndex - i) {
                break;
            }

            int temp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
        }
        return array;
    }
}
