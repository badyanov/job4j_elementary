package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140rubleThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0rubleThen0Euro() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert2EuroThen140Ruble() {
        int in = 2;
        int expected = 140;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert0EuroThen0Ruble() {
        int in = 0;
        int expected = 0;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert120rubleThen2Dollar() {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert0rubleThen0Dollar() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert2dollarThen120Ruble() {
        int in = 2;
        int expected = 120;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert0dollarThen0Ruble() {
        int in = 0;
        int expected = 0;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}