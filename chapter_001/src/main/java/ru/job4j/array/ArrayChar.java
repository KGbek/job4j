package ru.job4j.array;

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */

    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        int minLength = Math.min(data.length, value.length);
        for (int i = 0; i < minLength; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
