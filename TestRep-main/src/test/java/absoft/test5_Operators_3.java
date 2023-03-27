package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

import java.util.Scanner;

public class test5_Operators_3 {
    public static void main(String[] args) {

        System.out.println("Enter a number from 1 to 7: ");
        int day = new Scanner(System.in).nextInt();


        if (day == 1 ) {
            System.out.println("Monday");
        }else if (day == 2 ) {
            System.out.println("Tuesday");
        }   else if (day == 3 ) {
            System.out.println("Wednesday");
        }   else if (day == 4 ) {
            System.out.println("Thursday");
        }   else if (day == 5 ) {
            System.out.println("Friday");
        }   else if (day == 6 ) {
            System.out.println("Saturday");
        }   else if (day == 7 ) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error, enter a number from 1 to 7! ");}








    }

}
