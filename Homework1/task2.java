//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
package Homework1;

import java.util.Random;

public class task2 {
    public static void main(String[] args)
    {
        /*
		int i = (int) (Math.random()*101);
        System.out.print("случайно выпавшее число = "); 
		System.out.println(i);

        System.out.print("в двоичной системе это число = "); 
        System.out.println(Integer.toBinaryString(i));

        System.out.print("номер старшего бита = "); 
        int n = (int)(Math.log(i)/Math.log(2))+1;
        System.out.println(n);
        */

        
        int i = new Random().nextInt(65536);
        String n = Integer.toBinaryString(i);    
        int m = (int)(Math.log(i)/Math.log(2))+1;
        
        System.out.println("случайно выпавшее число = " + i); 
        System.out.println("в двоичной системе это число = " + n); 
        System.out.print("номер старшего бита = " + m); 
	}
}

