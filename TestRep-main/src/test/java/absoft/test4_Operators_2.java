package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию switch - case
 */

import java.util.Scanner;

public class test4_Operators_2 {

    public static void main(String[] args) {

        System.out.println("Enter a number from 1 to 7: ");
        int day = new Scanner(System.in).nextInt();


        switch (day) {
            case 1:
                day = 1;
            {
                System.out.println("Monday");
                break;
            }
            case 2:
                day = 2;
            {
                System.out.println("Tuesday");
                break;
            }
            case 3:
                day = 3;
            {
                System.out.println("Wednesday");
                break;
            }
            case 4:
                day = 4;
            {
                System.out.println("Thursday");
                break;
            }
            case 5:
                day = 4;
            {
                System.out.println("Friday");
                break;
            }
            case 6:
                day = 6;
            {
                System.out.println("Saturday");
                break;
            }
            case 7:
                day = 7;
            {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Error, enter a number from 1 to 7! ");
                break;
            }


        }

    }
}
