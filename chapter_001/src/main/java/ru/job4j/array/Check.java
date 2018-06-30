package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (boolean b : data) {
            if (b != true)
                return false;
        }
        return true;
    }
}
