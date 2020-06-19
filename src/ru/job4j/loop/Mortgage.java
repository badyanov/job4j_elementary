package ru.job4j.loop;

/**
 * посчитать количество лет, необходимых для погашения кредита.
 * @author d.badyanov@outlook.com
 */
public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double amountDue = amount;
        while (amountDue >= 0) {
            amountDue += amountDue * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
