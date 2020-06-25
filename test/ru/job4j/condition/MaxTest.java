package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test
    public void when2And1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void when1And10Then10() {
        int result = Max.max(1, 10);
        assertThat(result, is(10));
    }
    @Test
    public void when5And5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenMinus5And0Then0() {
        int result = Max.max(-5, 0);
        assertThat(result, is(0));
    }

    // 3. Перегрузить метод max для трех чисел [#285762]
    @Test
    public void when1And2And3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when1And3And2Then3() {
        int result = Max.max(1, 3, 2);
        assertThat(result, is(3));
    }

    // 3. Перегрузить метод max для четырех чисел [#285762]
    @Test
    public void when1And2And3And4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void when1And2And4And3Then4() {
        int result = Max.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
}