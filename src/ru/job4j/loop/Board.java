package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                // условие проверки: сумма индексов должна делиться на 2 без остатка
                if ((row + column) % 2 == 0) {
                    System.out.print("■");
                } else {
                    System.out.print("□");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
