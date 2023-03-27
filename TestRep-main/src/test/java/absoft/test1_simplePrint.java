package absoft;
// import java.util.Scanner;

/*
Напишите программу в которой пользователь должен ввести с клавиатуры name и age

Выведите на экран 2 строки:
Hello (name)
Your age is (age)
 */

import java.util.Scanner;

public class test1_simplePrint {

    public static void main (String [] args) {

        System.out.println("Hello, enter your name: ");

        String name = new Scanner(System.in).nextLine();

        String result = "Hello, " + name;

        System.out.println(result);

        System.out.println("Enter your age: ");

        String age = new Scanner(System.in).nextLine();

        String result1 = "Your age is " + age;

        System.out.println(result1);





    }
}


