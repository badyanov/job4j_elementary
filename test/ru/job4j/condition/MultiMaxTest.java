package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 4, 2);
        assertThat(result, is(6));
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 12, 2);
        assertThat(result, is(12));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 4, 22);
        assertThat(result, is(22));
    }

    @Test
    public void whenAllTheSame() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}