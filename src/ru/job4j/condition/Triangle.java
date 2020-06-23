package ru.job4j.condition;

/**
 * 2.2. Рефакторинг - Площадь треугольника. [#285760]
 * @author d.badyanov@outlook.com
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Вычисление площади треугольника через полупериметр p/2 и длины его сторон
     * @return Площадь треугольника. Возвращает -1 если треугльник с такими координатами не может существовать
     */
    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = halfPerimetr(ab, ac, bc);
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Вычисление полу-периметра треугольника по длинам сторон
     * @return полупериметр
     */
    public double halfPerimetr(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Проверка возможности существования сторон по длинам сторон треугольника (Задача из блока № 1)
     * @return true если треугольник с такими сторонами может существовать
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }
}
