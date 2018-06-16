package ru.job4j.convertor;

/**
 * Конвертор валют.
 */

public class Convertor {

    /**
     * Конвертируем доллар на рубли.
     * @param value рубли.
     * @return доллар.
     */

    public int rubleToDollar(int value) {
        return value / 63;
    }

    public int dollarToRuble(int value) {
        return value * 63;
    }

    /**
     * Конертируем евро на рубли.
     * @param value рубли.
     * @return евро.
     */

    public int rubleToEuro(int value){
        return value / 74;
    }

    public int euroToRuble(int value) {
        return value * 74;
    }
}
