package Homework2;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
public class task03_1 {
    // Задание 3. Дано два числа, например 3 и 56, необходимо составить следующие строки: 
    // 3 + 56 = 59 
    // 3 – 56 = -53 
    // 3 * 56 = 168 Используем метод StringBuilder.append().
    // Замените символ “=” на слово “равно”. 
    // Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    
    public static void main (String[] args) {

    // Решение примеров математическим способом:
    System.out.println("Введите a и b: ");
    try (
        Scanner scanner = new Scanner(System.in)) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        builder.append(getMathExpressions(a,b, '+', (x, y) -> x + y))
                .append(getMathExpressions(a,b, '-', (x, y) -> x - y))
                .append(getMathExpressions(a,b, '*', (x, y) -> x * y));
        System.out.println(builder.toString());
        System.out.println(builder.toString().replaceAll("=", "равно"));
    
    }
    }
    static String getMathExpressions(int a, int b, char signOp, IntBinaryOperator binaryOperator) {
    return  String.format("%d %c %d = %d;\n", a, signOp, b, binaryOperator.applyAsInt(a, b));
    }
    public static void main2 (String[] args) {
    System.out.println("Введите a и b: ");
    // Предсталение примеров в строковом виде:
        int i1 = 3;
        int i2 = 56;
        int i3 = i1 + i2;
        StringBuilder sb = new StringBuilder("i1   i2");
        sb.insert(4, "+");
        System.out.println(sb);
    }

}

