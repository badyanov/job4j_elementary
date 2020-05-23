package ru.job4j.array;

/**
 * 6.8. Дефрагментация массива. [#285617]
 */
public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int newIndex = point + 1; newIndex < array.length; newIndex++) {
                    if (array[newIndex] != null) {
                        /* поменять ячейки местами */
                        swap(array, point, newIndex);
                        break;
                    }
                }
            }
            //System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = array[notNullIndex];
        array[notNullIndex] = array[nullIndex];
        array[nullIndex] = temp;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}