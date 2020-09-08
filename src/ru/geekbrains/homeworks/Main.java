package ru.geekbrains.homeworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    doTask1();
	    doTask2();
	    doTask3a();
	    doTask3b();

	    //Задание Макса

        Task task = new Task("20");
        task.createRandomArray();
    }
    public static void doTask1(){
        // Массив предназначен для хранения значений ростов двенадцати человек.
        // помощью датчика случайных чисел заполнить массив целыми значениями,
        // лежащими в диапазоне от 163 до 190 включительно.

        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i<=12; i++){
            heights.add(i, generateRandomValue());
        }
        System.out.println(heights);
    }
    public static int generateRandomValue(){
        int v = (int)(Math.random()*(190-163+1)+163);
        return v;
    }

    public static void doTask2(){
        //Используя датчик случайных чисел, заполнить массив из двадцати элементов неповторяющимися числами.

        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int i = 0; i<=12; i++){
            uniqueValues.add((int)(Math.random()*100));
        }
        System.out.println(uniqueValues);
    }
    public static void doTask3a(){
        //Заполнить массив:
        // а) двадцатью первыми натуральными числами, делящимися нацело на 13 или на 17
        // и находящимися в интервале, левая граница которого равна 300;

        List<Integer>naturalValues = new ArrayList<>();
        int check = 0;
        int val = 300;
        do {
            if ((val%13 ==0) && (val%17 ==0)){
                naturalValues.add(val);
                check++;
            }
            val++;
        } while (check !=20);
            System.out.println(naturalValues);
    }
    public static void doTask3b(){
        // б) тридцатью первыми простыми числами (простым называется натуральное число, большее 1,
        // не имеющее других делителей, кроме единицы и самого себя).

        List<Integer>simpleValues = new ArrayList<>();
        
        System.out.println(simpleValues);
    }
}
