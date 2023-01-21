package Homework3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

// Задача 1. Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. 
// Удалить из первого списка элементы отсутствующие во втором списке. 
// Отсортировать первый список методом sort класса Collections.
// * Отсортировать второй список методом sort списка и компаратором по уменьшению.
public class task01 {
    
    public static void main(String[] args) {

        //Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.

        ArrayList <Integer> arrayList1 = new ArrayList<>();
        ArrayList <Integer> arrayList2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i= 0; i < 20; i++) {
            arrayList1.add(rnd.nextInt(101));
        }   
        for (int i= 0; i < 20; i++) {
            arrayList2.add(rnd.nextInt(101));
        }   
        
        ArrayList<Integer> newArrayList1 = new ArrayList<>(arrayList1);

        System.out.println(arrayList1);
        System.out.println(arrayList2);

        // Удалить из первого списка элементы отсутствующие во втором списке. 

        arrayList1.retainAll(arrayList2); 
        System.out.println("Отфильтрованный список = " + arrayList1);

        // Отсортировать первый список методом sort класса Collections.
        
        Collections.sort(arrayList1);
        System.out.println("Отсортированный список = " + arrayList1);
	    
              
        // *Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.
        
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < newArrayList1.size() - 1; i++) {
                if (newArrayList1.get(i) > newArrayList1.get(i+1)) {
                    isSorted = false;
                    buf = newArrayList1.get(i);
                    newArrayList1.set(i, newArrayList1.get(i+1));
                    newArrayList1.set(i+1, buf);
                    //mas[i] = 5
                    //list.set(i,5);
                }
            }
        }

        System.out.println("Отсортированный список пузырьком  = " + newArrayList1);
    } 
       
        
    }
/*
    public static void bubbleSort(int[] arrayList){
        for (int i = 0; i < arrayList.length - 1; i++) {
            for (int j = 0; j < arrayList.length - 1; j--) {
                if(arrayList[j - 1] < arrayList[j]) {
                    int tmp = arrayList[j-1];
                    arrayList[j-1] = arrayList[j];
                    arrayList[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayList));
    }
    */
    




