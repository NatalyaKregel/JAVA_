package Lessons;

public class lessonhom {
    public static void main (String[] args) {
        // Представление примеров в строковом виде:
        int number1 = 3;
        int number2 = 56;
        int number3 = number1 + number2;
        int number4 = number1 - number2;
        int number5 = number1 * number2;
        String.valueOf(number3);
        String.valueOf(number4);
        String.valueOf(number5);
        
        System.out.println(number1 + " + "  + number2 + " = " + number3); 
        System.out.println(number1 + " - "  + number2 + " = " + number4); 
        System.out.println(number1 + " * "  + number2 + " = " + number5); 
        System.out.println("Замена знака: " );
                
        StringBuilder str1 = new StringBuilder("3 + 56 = 59");
        StringBuilder str2 = new StringBuilder("3 – 56 = -53");
        StringBuilder str3 = new StringBuilder("3 * 56 = 168");
        // удаляем знак =
        str1.delete(7,8);
        str2.delete(7,8);
        str3.delete(7,8);
        // вставлем слово "равно"
        str1.insert(7, "равно");
        str2.insert(7, "равно");
        str3.insert(7, "равно");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        } 
        

}
