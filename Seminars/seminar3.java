package Seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class seminar3 {
    /*
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i=0; i<ints.length; i++) {
            ints[i] = new Random().nextInt(100);
        }

        int[] tmp = new int[ints.length+1];
        tmp[0] = ints[0];
        tmp[1] = 123;
        for (int i = 2; i<tmp.length; i++) {
            tmp [i] = ints[i-1];
        }
        ints = tmp;

        //улучшает ПТ
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //list.add(123);
        */
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            list.add(rnd.nextInt(5));
        }

        for (int i = 0; i<10; i++) {
            list2.add(rnd.nextInt(5));
        }
        list.forEach(h -> System.out.print(h+ " "));
        System.out.println();
        list2.forEach(h -> System.out.print(h+ " "));
        System.out.println();

        //list.retainAll(list2); // оставляет все которые есть в первом
        //list.removeAll(list2); // удаляет одинаковые элементы (фильтр)
        list.forEach(h -> System.out.print(h+ " "));
        
        /*
        // Задача: создать список, заполнить рандомно и отсортировать по уменьшению.
        ArrayList<Integer> list3 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            list3.add(rnd.nextInt(5));
        }
        Arrays.sort(list, Collections.reverseOrder());
*/

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int index = 0; index < 10; index++) {
            arrayList.add(rnd.nextInt(1001));
        }    
        
        System.out.println();
    }    
    

    public static ArrayList<Integer> sortList(ArrayList<Integer> list) {
        //ArrayList <Integer> arrayList = new ArrayList<>();
        //int tmp = list.get(0);//доступ к конкретному элементу
        //list.set(0, 7); // вместо 0 вставит 7
        //list.add(0, 8); // добавляет в 0 новое значение и список подвигается
        //list.remove(0); //удалить элемент из списка
/*
        int index = list.size()-1;
       
        while (index >= 0) {
            int max = list.get(index);
            for (int i = 0; i < index-1; i++) {
                if(list.get(i) >= max) max = list.get(i);
                list.set(i, max);

            }
            index--;
        }

*/      // сортировка по убыванию
        list.sort(new Comparator<Integer>() {
            public int compare (Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
        System.out.println(list);
       // return arrayList;
    }
    }

    


    
