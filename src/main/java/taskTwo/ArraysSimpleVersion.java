package taskTwo;

import java.util.Random;
import java.util.Scanner;

public class ArraysSimpleVersion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rnd = new Random();
            String[][] array = new String[5][5];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = "-";
                }
            }
            int column = rnd.nextInt(array.length);
            int raw = rnd.nextInt(array.length);
            System.out.println("All set. Get ready to rumble!");
            consoleArray(array);
            while (true) {
                System.out.println("Enter  column and row number for game:");
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x > 0 && x <= array.length && y > 0 && y <= array.length) {
                    if (x == column && y == raw) {
                        array[x - 1][y - 1] = "+";
                        System.out.println("You have won!");
                        consoleArray(array);
                        break;
                    } else {
                        System.out.println("you didn't hit the right spot, enter again:");
                        array[x - 1][y - 1] = "*";
                        consoleArray(array);
                    }
                } else {
                    System.out.println("number must be between 1 and 5, wrong answer");
                }

            }
        }

        static void consoleArray(String[][] exArray) {
            int k = 0;
            int m = 1;
            for (int i = 0; i < exArray.length; i++) {
                for (int j = 0; j < exArray.length; j++) {
                    if (i == 0) {
                        System.out.print((k++) + " ");
                    } else if (j == 0) {
                        System.out.print((m++)+"|");
                    } else {
                        System.out.print(exArray[i - 1][j - 1]+"|");
                    }
                }
                System.out.println();
            }
        }
}

