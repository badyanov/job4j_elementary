package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        swap(array, 1, 2); // 1, 3, 2, 5, 4
        swap(array, 3, 4); // 1, 2, 3, 5, 4

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
