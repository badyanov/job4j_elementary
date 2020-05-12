package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    // Тесты для предыдущего задания: sum()
    @Test
    public void whenSumFrom0To1Then1() {
        int rsl = Counter.sum(0, 1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumFrom0To10Then55() {
        int rsl = Counter.sum(0, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumFrom3To8Then33() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }

    // Тесты для метода sumByEven()
    @Test
    public void whenSumByEvenFrom0To1Then0() {
        int rsl = Counter.sumByEven(0, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumByEvenFrom0To10Then30() {
        int rsl = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumByEvenFrom3To8Then18() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}