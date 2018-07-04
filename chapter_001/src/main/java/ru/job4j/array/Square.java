package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i != rst.length; i++) {
            rst[0] = 1;
            rst[1] = 2;
            rst[2] = 3;
            rst[i] *= rst[i];
        }
        return rst;
    }
}
