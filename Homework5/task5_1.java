// 1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// 3. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// 4. Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
// 5. Изменить значения сделав пол большой буквой.

package Homework5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class task5_1 {

    public static void main(String[] args) {

// 1. Создаем словарь HashMap - Обобщение <Integer, String>.
        HashMap<Integer,String> Person_data = new HashMap<>();

// 2. Заполняем пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавляем ключ.
        Person_data.put(0, "Иванов Иван Иванович 29 м");
        Person_data.put(1, "Петров Петр Петрович 30 м");
        Person_data.put(2, "Кириллов Кирилл Кирилович 36 м");
        Person_data.put(3, "Котова Екатерина Андреевна 43 ж");
        Person_data.put(4, "Игнатова Инна Ивановна 25 ж");
        Person_data.put(5, "Голубев Елисей Евгеньевич 28 м");
        Person_data.put(6, "Артемова Алина Федоровна 22 ж");
        Person_data.put(7, "Быкова Анна Андреевна 33 ж");
        Person_data.put(8, "Ильин Илья Ильич 21 м");

        changeLetter(Person_data);

        Person_data.entrySet()
                .forEach((entry) -> System.out.println(entry.getKey() + " - " + entry.getValue()));

// 3. Проходим по коллекции и выводим значения в формате: Фамилия + инициалы "Иванов И.И."
        Set<Integer> keys = Person_data.keySet();
        System.out.println("\nКоллекция в формате - фамилия + инициалы: ");
        for (Integer key: keys) {
            String data1 = Person_data.get(key).split(" ")[0];
            String data = data1.toUpperCase().charAt(0)+data1.toLowerCase().substring(1, data1.length());
            data1 = Person_data.get(key).split(" ")[1].toUpperCase().charAt(0)+".";
            data = data + " " + data1;
            data1 = Person_data.get(key).split(" ")[2].toUpperCase().charAt(0)+".";
            data = data + data1;
            System.out.println(data);
        }
// 4. *Сортируем значения по возрасту и выводим отсортированную коллекцию
        List<String> values = new ArrayList<>(Person_data.values());
        values.sort(Comparator.comparing(x -> Integer.parseInt(x.split(" ")[3])));
        System.out.println("\nКоллекция в формате - отсортированная по возрасту: ");
        for (String i : values) {
            String[] a = i.split(" ");
            System.out.printf("%s %s.%s. %s %s\n", a[0], a[1].substring(0, 1), a[2].substring(0, 1), a[3], a[4]);
        }
    }
    
// 5. Меняем значения, делая пол человека с большой буквы.
    static void changeLetter(HashMap<Integer, String> Person_data){
        System.out.println();
        System.out.println("\nКоллекция в формате - пол с заглавной буквы:");

        for (Integer key: Person_data.keySet()){
            String str = Person_data.get(key);
            int index = str.length() - 1;
            char ch = Character.toUpperCase(str.charAt(index));
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(index, ch);
            str = sb.toString();
            Person_data.put(key, str);
        }

    }
     
}
