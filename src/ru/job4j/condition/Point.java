package ru.job4j.condition;

/**
 * 2.1. Рефакторинг - Расстояние между точками. [#285759]
 * @author d.badyanov@outlook.com
 */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * 2.1. Рефакторинг - Расстояние между точками. [#285759]
     * @param first - координата x
     * @param second - координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
        this.z = 0;
    }

    /**
     * 4. Расстояние между точками в трехмерном пространстве. [#285761]
     * @param first - координата x
     * @param second - координата y
     * @param third - координата z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2) + Math.pow((this.z - that.z), 2));
    }

    public double distance3d(Point that) {
        return distance(that);
    }

    public String info() {
        return String.format("[%s, %s, %s]", this.x, this.y, this.z);
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0, 3);
        Point b = new Point(2, 0, 3);
        double result = a.distance(b);
        System.out.println("distance: " + a.info() + " - " + b.info() + " = " + result);

        a = new Point();
        b = new Point(1, 1, 1);
        result = a.distance3d(b);
        System.out.println("distance: " + a.info() + " - " + b.info() + " = " + result);
    }
}
