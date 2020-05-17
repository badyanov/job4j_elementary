package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5ThenMinus1() {
        int[] input = new int[] {4, 8, 15, 16, 23, 42};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas42Then5() {
        int[] input = new int[] {4, 8, 15, 16, 23, 42};
        int value = 42;
        int result = FindLoop.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }

    // + #285603
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindOnlyFirst4() {
        int[] input = new int[] {4, 8, 15, 16, 23, 42};
        int value = 4;
        int start = 0;
        int finish = 0;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFindWithoutLast42() {
        int[] input = new int[] {4, 8, 15, 16, 23, 42};
        int value = 42;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind23InTheMiddle() {
        int[] input = new int[] {4, 8, 15, 16, 23, 42};
        int value = 23;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind4InTheMiddle() {
        int[] input = new int[] {4, 8, 15, 16, 23, 42};
        int value = 88;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}