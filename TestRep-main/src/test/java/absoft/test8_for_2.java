package absoft;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class test8_for_2 {
    public static void main(String[] args) {
        var from = 1;
        var to = 20;

        System.out.println("Enter a number from 1 to 20: ");

        var name  = new Scanner(System.in).nextInt();


            if (name < from || name > to )
            {
                System.out.println("Error! Enter a number from 1 to 20");

            } else {

                for (int i = from; i <= name && i <= name ; i++) { {
                System.out.println(i);

            }
            }
        }
    }
}
