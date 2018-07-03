package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        if(data.length > 1)
            return data[0] == data[1];
        else
            return false;
    }
}
