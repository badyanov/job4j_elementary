package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    // 6.7.1. Моно строка в матрице. [#285607]
    @Test
    public void whenHasLine1MonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasLine2MonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasNoLine1MonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'1', '2', '3'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasNoLineOutOfRangeMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 4);
        assertThat(result, is(false));
    }

    // 6.7.2. Моно столбец в матрице. [#285608]
    @Test
    public void whenHasMonoLine2Vertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoLine0Vertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 0);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasNoMonoLine0Vertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {'X', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasOutOfRangeMonoVertical() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {'X', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 3);
        assertThat(result, is(false));
    }

    //    6.7.3. Массив из диагонали матрицы. [#285609]
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDiagonal2() {
        char[][] input = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'a', 'g', 'm', 's', 'y'};
        assertThat(result, is(expect));
    }

    //  6.7.4. Выигрышные комбинации в сокобан [#285600]
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse2() {
        char[][] input = {
                {'X', ' ', 'X', ' ', 'X'},
                {' ', 'X', 'X', 'X', ' '},
                {'X', 'X', ' ', 'X', 'X'},
                {' ', 'X', 'X', 'X', ' '},
                {'X', ' ', 'X', ' ', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }


}