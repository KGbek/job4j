package ru.job4j.loop;
import java.util.function.BiPredicate;

/*
 * @author Edilbek Manabaev (mailto:edilbek@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Paint {

    private String loopBy(int weight, int height, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    //Правая часть пирамида.

    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    //Пишем теперь левую сторону пирамиды
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column -1
        );
    }

    //Объединяем две пирамиды в одну целую
    public String piramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column -1 && row + height - 1 >= column
        );
    }
}
