package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {

        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        // ++ #285610
        String[] names = new String[4];
        names[0] = "Michelangelo";
        names[1] = "Donatello";
        names[2] = "Leonardo";
        names[3] = "Raphael";

        for (String name:names) {
            System.out.println(name);
        }
    }
}
