package Seminars;

import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class seminar5 {
        public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "one");
        hashMap.putIfAbsent("2", "two");
        System.out.println(hashMap.putIfAbsent("1", "one"));
        // System.out.println(hashMap.containsKey("1")); // наличие ключа
       
        Set<String> keySet = hashMap.keySet();
        //более старый и медленный
        for (int i = 0; i < keySet.size(); i++) {
            System.out.println(hashMap.get(keySet.toArray()[i])); // получает значения
        }
        // более быстрый
        for (String value: hashMap.keySet()) {
            System.out.println(value);
            //hashMap.remove(value);
        /*
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hashNext()) {
            String l = iterator.next();
            System.out.println(l);
            //hashMap.remove(keySet.toArray()[0]);
            //iterator.remove();// удалит элеент из хэшмэпа
            if (l.equals("4")) iterator.remove();
        */    

            hashMap.forEach((k,v) -> System.out.println(k+" "+v)); // выводит 2 значения, ключ и значение

            hashMap.compute("Один", (k,v) -> v+="!");// добавить ко всем значениям !     v.toLowerCase()

            hashMap.remove(keySet.toArray()[0]);

        }    
            
    }
}

