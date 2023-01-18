package Homework1;

import java.util.Arrays;
import java.util.Random;

public class task5 {

    public static void main(String[] args) {
       
        // Задание №1: Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2001);
        System.out.println(String.format("Случайное число = %s", i));

     
        // Задание №2: Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int a = i;
        int n = 0;
        for (int j = 0; a > 0; j++){
            a >>= 1;
            n = j;
        }
        System.out.println(String.format("Номер сташего бита = %s",n));


        // Задание №3: Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int b = 0;
        for (int j = i; j<Short.MAX_VALUE;j++) {
            if (j % n == 0) b++;

        }
        int [] m1 = new int[b];
        b = 0;
        for (int j = i; j<Short.MAX_VALUE;j++) {
            if (j % n == 0) m1[b++] = j;
        }
        
      
        // Задание №4: Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int k = 0;
        for (int j =Short.MIN_VALUE; j>i;j++) {
            if (j % n != 0) k++;

        }
        int [] m2 = new int[k];
        k = 0;
        for (int j =Short.MIN_VALUE; j>i;j++) {
            if (j % n != 0) m2[k++] = j;
        }
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
    
    }

}      