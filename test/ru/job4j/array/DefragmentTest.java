package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void allNull() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllNull() {
        String[] input = {"One", "Two", "Three"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"One", "Two", "Three"};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}