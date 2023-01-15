//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

package Homework1;

public class task1 {
    public static void main(String[] args)
    {
		int i = (int) (Math.random()*2000);
        System.out.print("случайно выпавшее число = "); 
		System.out.println(i);
	}
}
