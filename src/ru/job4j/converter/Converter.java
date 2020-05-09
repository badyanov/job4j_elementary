package ru.job4j.converter;

public class Converter {
    final static int EUR = 70;
    final static int USD = 60;

    public static int rubleToEuro(int value) {
        return value / EUR;
    }
    public static int euroToRuble(int value) {
        return value * EUR;
    }
    public static int rubleToDollar(int value) {
        return value / USD;
    }
    public static int dollarToRuble(int value) {
        return value * USD;
    }

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
