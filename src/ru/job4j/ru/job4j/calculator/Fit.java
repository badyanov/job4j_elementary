package ru.job4j.ru.job4j.calculator;

public class Fit {
//    Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
    public static double manWeight(double height) {
        if (height > 100) {
            return (height - 100) * 1.15;
        } else {
            return 0;
        }
    }

//    Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
    public static double womanWeight(double height) {
        if (height > 110) {
            return (height - 110) * 1.15;
        } else {
            return 0;
        }
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
