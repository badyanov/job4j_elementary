package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 6.5.3. Сортировка выборкой.[#285604]
 */
public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {23, 4, 42, 8, 15, 16};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {4, 8, 15, 16, 23, 42};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {1, 0, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 1};
        assertThat(result, is(expect));
    }
}