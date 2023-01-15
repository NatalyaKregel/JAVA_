//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

package Homework1;

public class task2 {
    public static void main(String[] args)
    {
		int i = (int) (Math.random()*101);
        System.out.print("случайно выпавшее число = "); 
		System.out.println(i);

        System.out.print("в двоичной системе это число = "); 
        System.out.println(Integer.toBinaryString(i));

        System.out.print("номер старшего бита = "); 
        int n = (int)(Math.log(i)/Math.log(2))+1;
        System.out.println(n);
         
	}
}

