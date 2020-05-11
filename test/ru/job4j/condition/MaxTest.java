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
}