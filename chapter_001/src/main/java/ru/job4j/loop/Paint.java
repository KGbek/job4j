package ru.job4j.loop;

/*
 * @author Edilbek Manabaev (mailto:edilbek@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Paint {

    //Правая часть пирамида.

    public String rightTrl(int height) {
        //Буфер для результата
        StringBuilder screen = new StringBuilder();
        //Ширина будет ровна высоте
        int weidth = height;
        //внешний цикл будет двигаться по строкам
        for (int row = 0; row != height; row++) {
            //внутренний цикл определяет положение ячейки в строке
            for (int column = 0; column != weidth; column++) {
                //если строка ровна ячейки, то рисуем галку
                //в данном случае строка определяет, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            //добавляем перевод строки
            screen.append(System.lineSeparator());
        }
        //получаем результат
        return screen.toString();
    }

    //Пишем теперь левую сторону пирамиды
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    //Объединяем две пирамиды в одну целую
    public String piramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weidth = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weidth; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        screen.toString();
    }
}
