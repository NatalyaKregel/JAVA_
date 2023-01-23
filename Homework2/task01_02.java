package Homework2;
//import java.util.Scanner;
//import java.util.function.IntBinaryOperator;

public class task01_02 {
    // Задание 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    static String str1 = "Hello";
    static String str2 = "Hello";
    public static void main (String str1, String str2) { 
        word2(str1, str2);                                         
        word2(str1, new StringBuilder(str2).reverse().toString()); 
        System.out.println(str1.contains(str2));
    }
        
    //Задание 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static void word2(String str1, String str2) { 
        System.out.println(str1.contains(str2));
    }

    
}        
 