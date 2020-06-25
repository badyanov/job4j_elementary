package ru.job4j.max;

/**
 * 5.1. Зона видимости переменных [#285771]
 */
public class Reduce {
    private int[] array;

    public void to(int[] array) {
        // фрагмент некорректного кода:
        // array = array;
        // исправленный вариант:
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
