/*Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
Дано два числа, например 3 и 56, необходимо составить следующие строки: 
3 + 56 = 59 
3 – 56 = -53 
3 * 56 = 168 
Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. 
Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
*/

package Seminars;

public class seminar2 {

    public static void main (String[] arg) {
        word("Hello", "word");

    }
    //1. вхождение в строке (содержащей все символы другой строки).
    public static void word(String str1, String str2) { 
        System.out.println(str1.contains(str2));
        
    }
        //word(str1, str2);
        //word(str1, nex StringBuilder(str2).reverse().toString());


    //являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static void word2(String str1, String str2) { 
        System.out.println(str1.contains(str2));
        
    }

}        
 