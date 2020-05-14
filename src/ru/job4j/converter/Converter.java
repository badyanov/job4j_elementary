package ru.job4j.converter;

/**
 * Класс предназначен для конвертации валюты (Доллар, Евро) в рубли и обратно
 * Курс доллара и евро устанавливаются вручную в константах класса
 *
 * @author Дмитрий Бадьянов (d.badyanov@outlook.com)
 */
public class Converter {
    /**
     * Курс Евро
     */
    final static int EUR = 70;
    /**
     * Курс доллара
     */
    final static int USD = 60;

    /**
     * Конвертация Рубль - Евро
     * @param value - Количество в рублях
     * @return количество в Евро (округление до целого)
     */
    public static int rubleToEuro(int value) {
        return value / EUR;
    }

    /**
     * Конвертация Евро - Рубль
     * @param value - Количество в Евро
     * @return количество в рублях (округление до целого)
     */
    public static int euroToRuble(int value) {
        return value * EUR;
    }

    /**
     * Конвертация Рубль - Доллар
     * @param value - Количество в рублях
     * @return количество в Долларах (округление до целого)
     */
    public static int rubleToDollar(int value) {
        return value / USD;
    }

    /**
     * Конвертация Доллар - Рубль
     * @param value - Количество в Долларах
     * @return количество в рублях (округление до целого)
     */
    public static int dollarToRuble(int value) {
        return value * USD;
    }

    /**
     * Метод используется для ручного тестирования корректности конвертации валют
     * и выводит результат тестирования в консоль
     *
     * @param args - не используются
     */
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        System.out.println(in + " rubles are " + out + " euro.");
        boolean passed = expected == out;
        System.out.println("Test result: " + passed);

        in = 115000;
        expected = 1916;
        out = Converter.rubleToDollar(in);
        System.out.println(in + " rubles are " + out + " dollars.");
        passed = expected == out;
        System.out.println("Test result: " + passed);

        in = 500;
        expected = 35000;
        out = Converter.euroToRuble(in);
        System.out.println(in + " euro are " + out + " rubles.");
        passed = expected == out;
        System.out.println("Test result: " + passed);

        in = 3000;
        expected = 180000;
        out = Converter.dollarToRuble(in);
        System.out.println(in + " dollars are " + out + " rubles.");
        passed = expected == out;
        System.out.println("Test result: " + passed);
    }
}
