package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
//        boolean result = false;
//        for (int i = 0; i != data.length; i++) {
//            result = data[0] == data[i];
//            if (data[0] != data[i]) {
//               result = false;
//               return result;
//            }
//
//        }
//        return result;
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
            }
        }
        return result;
    }
}
