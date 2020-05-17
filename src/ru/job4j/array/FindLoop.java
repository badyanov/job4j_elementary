package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        return FindLoop.indexOf(data, el, 0, data.length - 1);
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

}
