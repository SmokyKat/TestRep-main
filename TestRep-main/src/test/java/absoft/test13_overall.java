package absoft;

/*
Напишите программу в которой:
1) Пользователь должен ввести product name, price и qty для 5 продуктов
2) Программа должна посчитать total = price * qty для каждого продукта
3) Программа должна вывести в консоль product name и total по каждому продукта (пример Phone | 120.0)

Note1: price может быть как целым так и дробным числом
Note2: price и qty не могут быть равны "0" (вывести ошибку и прервать программу)
Note3: класс откуда будет раниться тест, должен содержать в себе ТОЛЬКО ВЫЗОВ МЕТОДОВ (допускается создание переменных)
Сами методы должны лежать в отдельном классе и вызываться из него.
 */

import java.util.Scanner;

public class test13_overall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        test13_methods newProducts = new test13_methods();

        String[] productName = new String[5];
        double[] price = new double[5];
        int[] qty = new int[5];

        for (int f = 1; f <= 5; f++) {
            f = newProducts.productsList(scanner, productName, price, qty, f);
            newProducts.productsTotal(productName, price, qty,new double[5]);
        }
    }
}


