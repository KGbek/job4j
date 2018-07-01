package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length; index++) {
            for (int index2 = 0; index2 != data.length; index2++) {
                if (index == index2) continue;
                if (data[index] == data[index2]){
                    return true;
                } else return false;
            }
        }
        return result;
    }
}
