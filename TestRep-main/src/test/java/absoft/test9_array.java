package absoft;
/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в следующем виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */


import java.util.Arrays;

public class test9_array {
    public static void main(String[] args) {

        int[] array = new int[10];

            for (int i = 0; i < 10; i++){
                array[i] = i + 1;
            }
            System.out.println(Arrays.toString(array));

    }
}

