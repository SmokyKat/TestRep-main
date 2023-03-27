package absoft;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */

import java.util.Scanner;

public class test2_SumOfElements {

    public static void main(String[] args) {

        System.out.println("Enter price: ");

        double price = new Scanner(System.in).nextDouble();

        System.out.println("Enter qty: ");

        int qty = new Scanner(System.in).nextInt();

        var result = price * qty;

        System.out.println("Total: " + result);

    }

}