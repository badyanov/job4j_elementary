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
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(115000);
        System.out.println("115000 rubles are " + dollar + " dollars.");

        int rublesFromEuro = Converter.euroToRuble(500);
        System.out.println("500 euro are " + rublesFromEuro + " rubles.");

        int rublesFromDollars = Converter.dollarToRuble(3000);
        System.out.println("3000 dollars are " + rublesFromDollars + " rubles.");
    }
}
