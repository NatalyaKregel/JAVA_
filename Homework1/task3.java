//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
package Homework1;


public class task3 {
    public static void main(String[] args){
        
        int q1 = 0;
		int[] array = new int[12];
        System.out.print(" массив случайных чисел m = ["); 
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * Short.MAX_VALUE) ;
            if (q1 != 0) System.out.print(", ");
            System.out.print(array[i]);
            q1 = 1;
        }
        System.out.print("]"); 
        System.out.println();

        int q2 = 0;
        int[] array1 = new int[12];
        System.out.print(" массив четных чисел m1 = ["); 
        for(int i=0;i<array1.length;i++) {
            if(array[i] % 2 == 0)
            {
                if (q2 != 0) System.out.print(", ");
                System.out.print(array[i]);
                q2 = 1;
            }
        }
        System.out.print("]"); 
        System.out.println();
    }


}    