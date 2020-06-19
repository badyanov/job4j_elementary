package ru.job4j.loop;

/**
 * Метод должен вычислять количество простых чисел от 1 до X включительно.
 * @author d.badyanov@outlook.com
 */
public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
