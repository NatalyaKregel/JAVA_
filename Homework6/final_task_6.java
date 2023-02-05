// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе создать метод add добавляющий элемент, 
// и метод позволяющий выводить эллементы коллекции в консоль. 
// Формат данных Integer.

package Homework6;
import java.util.HashMap;

public class final_task_6 {
// 1. Разрабатываем программу, имитирующую поведение коллекции HashSet.  
    private static HashMap<Integer, Object> hashMap = new HashMap<>();
    private static final Object object = new Object();
    public static void main(String[] args) {
        add(18);
        add(35);
        add(27);
        add(9); 
        add(55);
        add(41);
        System.out.println(getString()); 
    }

// 2. Создаем метод add, добавляющий элемент
    public static void add(Integer number){
        hashMap.put(number, object);   
	}
    
// 3. Создаем метод, позволяющий выводить элементы коллекции в консоль
	public static String getString(){
        return hashMap.keySet().toString();   
	}
}

