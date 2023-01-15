//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

package Homework1;

public class task4 {
    public static void main(String[] args){
        int q1 = 0;
        int i = 50000;
		int[] array = new int[12];
        System.out.print(" массив случайных чисел m = ["); 
        for (int j = 0; j < array.length; j++) {
            array[j] = (int)(Short.MIN_VALUE + Math.random() * i) ;
                if (q1 != 0) System.out.print(", ");
                System.out.print(array[j]);
                q1 = 1;
        }
        System.out.print("]"); 
        System.out.println();

        int q2 = 0;
        int[] array2 = new int[12];
        System.out.print(" массив нечетных чисел m2 = ["); 
        for(int j = 0; j < array2.length; j++) {
            if(array[j] % 2 != 0)
            {
                if (q2 != 0) System.out.print(", ");
                System.out.print(array[j]);
                q2 = 1;
            }
        }
        System.out.print("]"); 
    }
}
