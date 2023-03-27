package absoft;
/*
Написать программу которая будет выводить цифры от 1 до 10 используя цикл while
Когда цифра будет равна 2 или 6 или 10 - вывести сообщение ("[число] - some cool text")
 */

public class test7_while {
    public static void main(String[] args) {

        int from = 0;
        int to = 10;

        while (from < 10) {
            from++;

            if (from == 2 || from == 6 || from == 10) {

                System.out.println(from + " - some cool text");

            }else {
                    System.out.println(from);
                }

            }

            }


        }

