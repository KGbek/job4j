package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 *
 * Формула:
 * Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
 * Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double result;

    public double manWeight(double height) {
        double weight = 180;
        height = (weight - 100) * 1.15;
        return height;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        double weight = 170;
        height = (weight - 110) * 1.15;
        return height;
    }
}