package absoft;

import java.util.Arrays;
import java.util.Scanner;

public class test13_methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] productName = new String[5];
        double[] price = new double[5];
        int[] qty = new int[5];
        double[] total = new double[5];

        for (int f = 1; f <= 5; f++) {
            f = productsList(scanner, productName, price, qty, f);
            productsTotal(productName, price, qty, total);
        }
    }

    public static void productsTotal(String[] productName, double[] price, int[] qty, double[] total) {
        for (int q = 0; q < total.length; q++) {
            total[q] = price[q] * qty[q];
            System.out.println(productName[q] + " " + "|" + total[q] + " ");
        }
    }

    public static int productsList(Scanner scanner, String[] productName, double[] price, int[] qty, int f) {
        for (int i = 0; i < productName.length; i++) {
            System.out.print("Enter name for " + f + " " + "product: ");
            productName[i] = scanner.nextLine();

            System.out.print("Enter price for " + f + " " + "product: ");
            price[i] = scanner.nextDouble();

            System.out.print("Enter quantity for " + f + " " + "product: ");
            qty[i] = scanner.nextInt();
            scanner.nextLine();
            f++;
            {
                if (price[i] == 0 || qty[i] == 0) {
                    System.out.println("Error!Price or quantity can't be 0");
                    System.exit(0);
                }
            }
        }
        return f;
    }

    public static void productsList() {
    }

    public static void productsTotal() {
    }
}

