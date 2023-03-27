package absoft;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test10_array2 {
    public static void main(String[] args) {

        String[] arrayNames = {"John", "Dan", "Ashe", "Carl", "Bill"};
        Arrays.sort(arrayNames);
        /* System.out.println(Arrays.toString(arrayNames));*/

        System.out.println();

        String newString = "Stan";

        String[] arrayNamesNewList = Arrays.copyOf(arrayNames, arrayNames.length + 1);

        arrayNamesNewList[arrayNamesNewList.length -1 ] = newString;

        for (int i = 0; i < arrayNamesNewList.length; i++) {
            System.out.println(arrayNamesNewList[i]);

        }
    }

}

