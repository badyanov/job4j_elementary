package ru.job4j.calculator;

/**
 * Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
 * Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 * @author d.badyanov@outlook.com
 */
public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(178);
        System.out.printf("For man height 178 the ideal weight is %.2f", man);
        System.out.println();

        double woman = Fit.womanWeight(167);
        System.out.printf("For woman height 167 the ideal weight is %.2f", woman);
        System.out.println();
    }
}
