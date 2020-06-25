package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    /**
     * 3. Перегрузить метод max для трех чисел [#285762]
     */
    public static int max(int a1, int a2, int a3) {
        return max(max(a1, a2), a3);
    }

    /**
     * 3. Перегрузить метод max для четырех чисел [#285762]
     */
    public static int max(int a1, int a2, int a3, int a4) {
        return max(max(a1, a2), max(a3, a4));
    }
}
