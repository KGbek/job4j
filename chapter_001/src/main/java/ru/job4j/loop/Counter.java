package ru.job4j.loop;

public class Counter {
    int result = 0;

    public int add(int start, int finish){

        for(start = 0; start<=10; start++){
            if(start % 2 == 0){
                result = result + start;

            }
        }
        return result;

    }

}
