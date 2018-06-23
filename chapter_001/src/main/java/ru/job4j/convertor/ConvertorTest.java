package ru.job4j.convertor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertorTest {
    @Test
    public void when60RubleToDollarThen1() {
        Convertor convert = new Convertor();
        int result = convert.rubleToDollar(63);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarToRubleThen63(){
        Convertor convert = new Convertor();
        int result = convert.dollarToRuble(1);
        assertThat(result, is(63));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Convertor convert = new Convertor();
        int result = convert.rubleToEuro(74);
        assertThat(result, is(1));
    }

    @Test
    public void when1EuroToRubleThen74(){
        Convertor convert = new Convertor();
        int result = convert.euroToRuble(1);
        assertThat(result, is(74));
    }
}