package ru.job4j.condition;

/**
 * 2.1. Рефакторинг - Расстояние между точками. [#285759]
 * @author d.badyanov@outlook.com
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        System.out.println("result (0, 0) to (2, 0) = " + result);
    }
}
