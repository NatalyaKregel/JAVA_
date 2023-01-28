package Homework4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. 
//   Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

public class task01 {        
    public static void main(String[] args) {
                
        String str = "";
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        try {
            try (FileWriter fileWriter = new FileWriter("bd.sql")) {;
                fileWriter.append("Ivanov Ivan Ivanovich 40 M\n");
                fileWriter.append("Petrov Petr Petrovich 30 M\n");
                fileWriter.append("Sidorova Olga Alekseevna 28 Z\n");
                fileWriter.append("Kotova Victoriya Sergeevna 34 Z\n");
                fileWriter.append("Isakov Igor Igorevich 32 M\n");
                fileWriter.append("Krotova Irina Petrovna 29 Z\n");
                fileWriter.append("Kovaleva Ekaterina Vasilevna 39 Z\n");   
                fileWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }     

        try {
            try (FileReader reader = new FileReader("bd.sql")) {
                while (reader.ready()) str += (char) reader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }     

        // Выводим основной список Фамилия И.О.
        String[] temp = str.split("\n");
        System.out.println("Основной список: ");
        for (int i = 0; i < temp.length; i++) {
            String[] sb = temp[i].split(" ");
            System.out.printf("%s %s.%s. %s %s\n", sb[0], sb[1].toUpperCase().charAt(0), sb[2].toUpperCase().charAt(0), sb[3], sb[4]);

            family.add(sb[0]);
            name.add(sb[1]);
            soname.add(sb[2]);
            age.add(Integer.parseInt(sb[3]));
            gender.add(sb[4].equals("M") ? false : true);
            index.add(i);
        }

        // Сортируем основной список по возрасту
        System.out.println("\r\nОтсортированный список по возрасту: ");
        sortIndexesByIntList(age,index);
        printFromLists(family,name,soname,age,gender,index);
    }    

    private static void printFromLists(ArrayList<String> list1, ArrayList<String> list2, ArrayList<String> list3,
                                       ArrayList<Integer> list4, ArrayList<Boolean> list5, LinkedList<Integer> index) {

        for (Integer i : index) {
            String gender = (list5.get(i).equals(true) ? "Z" : "M");
            System.out.printf("%s %s.%s. %s %s\n", list1.get(i), list2.get(i).toUpperCase().charAt(0),
                    list3.get(i).toUpperCase().charAt(0), list4.get(i), gender);
        }
    }

    private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
        ArrayList<Integer> arr = new ArrayList<>(arrayToSort);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int tmp = ind.get(j);
                    ind.set(j, ind.get(j + 1));
                    ind.set(j + 1, tmp);
                    tmp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);
                }
            }
        }
    }    
}

