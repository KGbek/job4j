package ru.job4j.maximum;

/**
 * @author Edilbek Manabaev (mailto:edilbek@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**
     * This is method is campare and return the maximal number.
     * @param first
     * @param second
     * @return
     */

    public int max(int first, int second) {

        return first >= second ? first : second;

    }

    public int max (int first, int second, int third){

        int temp = this.max(first, second);
        int temp2 = this.max(temp, third);
        return temp2;
    }
}
