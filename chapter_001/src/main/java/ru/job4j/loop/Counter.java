package ru.job4j.loop;

public class Counter {
    int result;

    public int add(int start, int finish){

        for(int i = 0; i <= finish; i++){
            if(i % 2 == 0){
                result = result + i;

            }
        }
        return result;

    }

}
