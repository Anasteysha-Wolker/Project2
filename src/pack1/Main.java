package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];

       /* System.out.println("Введите целые числа с клавиатуры!");
        for (int i=0; 1 < arr.length; i++) {
            arr[i]= Integer.parseInt(reader.readLine());


        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Отсортированный массив: "Arrays.toString(arr));
        System.out.println("Введите число для поиска в массиве.");

        int number = Integer.parseInt(reader.readLine());
        boolean mark = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr [i]) {
                index = i;
                mark = true;
                break;
            }
        }
        System.out.println("В массиве есть число" + number + ": " + mark);
        System.out.println("Индекс числа в массиве : "+ index);*/


        /*String[] strArr = new String[7];
        for (int i=0; 1 < arr.length; i++) {
            strArr[i] = reader.readLine();
        }

        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr);

        System.out.println(Arrays.toString(strArr)); */

       Set<Integer> set1 = new TreeSet<>();
       System.out.println("Введите целые числа!");
       for (int i = 0; i < 7; i++) {
           set1.add(Integer.parseInt(reader.readLine()));

       }
       System.out.println(set1);
       Set<String> set2 = new TreeSet<>();
       System.out.println("Введите строки");
       for (int i = 0; i < 7; i++) {
           set2.add(reader.readLine());

       }
       System.out.println(set2);
       Set<User> set3 = new TreeSet<>();
       set3.add(new User("user_login1", "passw1", true));
       set3.add(new User("user_login2", "passw2", true));
       set3.add(new User("user_login3", "passw3", false));

       System.out.println(set3);

    }

}
