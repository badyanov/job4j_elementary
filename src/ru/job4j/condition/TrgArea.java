package ru.job4j.condition;

/**
 * Площадь треугольника по формуле Герона
 * @author d.badyanov@outlook.com
 */
public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl1);

        double rsl2 = TrgArea.area(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + rsl2);
    }
}
