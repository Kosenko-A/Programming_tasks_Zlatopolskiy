package ru.geekbrains.homeworks;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task {
    private final String size;

    public Task (String size){
        this.size = size;
    }

    void createRandomArray (){
        int n = Integer.parseInt(size);
        Set<Integer> mySet = new HashSet<>();
        for(int i = 0; i<=n; i++){
            mySet.add(createRandomNumber(n));
        }
        System.out.println(mySet);
    }
    private int createRandomNumber (int n){
        Random random = new Random();
        int randomNumber = random.nextInt(n);
        return randomNumber;
    }
}
