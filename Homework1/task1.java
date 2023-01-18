//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

package Homework1;

import java.util.Random;
public class task1 {
    public static void main(String[] args)
    {
		//int i = (int) (Math.random()*2000);
        int i = new Random().nextInt(2001);
        System.out.print("случайно выпавшее число = "); 
		System.out.println(i);
	}
}
