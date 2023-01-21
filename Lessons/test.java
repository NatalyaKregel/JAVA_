package Lessons;

//import java.util.ArrayList;
import java.util.Arrays;

public class test {
    /*
    public static void bubbleSort() {  
        int[] array = new int[10];
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
                
                }
            }
        System.out.println(Arrays.toString(array));    
        }
    }
    */
    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

