package ru.job4j.loop;

// проверка, является ли number простым числом

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;

        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
