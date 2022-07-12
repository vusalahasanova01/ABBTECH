package taskTwo;

import java.util.Random;
import java.util.Scanner;

public class ArraysComplexVersion {
    private final static char[][] array = new char[5][5];
    private final static int[][] cells = new int[3][2];

    public static void main(String[] args) {
        selectCells();
        System.out.println("All set. Get ready to rumble!");
        consoleArray(array);
        shootingPoint();
    }

    private static void consoleArray(char[][] exArray) {
        int k = 0;
        int m = 1;
        for (int i = 0; i <= exArray.length; i++) {
            for (int j = 0; j <= exArray.length; j++) {
                if (i == 0) {
                    System.out.print((k++) + " ");
                } else if (j == 0) {
                    System.out.print((m++) + "|");
                } else {
                    System.out.print(exArray[i - 1][j - 1] + "|");
                }
            }
            System.out.println();
        }
    }

    private static void shootingPoint() {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        while (true) {
            System.out.println("Enter  column and row number for game:");
            String x = sc.nextLine();
            int selectedX = check(x);
            String y = sc.nextLine();
            int selectedY = check(y);
            if (selectedX == -1 || selectedY == -1) {
                continue;
            }
            boolean selection = false;
            if (selectedX > 0 && selectedX <= array.length && selectedY > 0 && selectedY <= array.length) {
                for (int i = 0; i < cells.length; i++) {
                    if (selectedX == cells[i][0] && selectedY == cells[i][1] && array[selectedX - 1][selectedX - 1] == 'x') {
                        selection = true;
                    } else if (selectedX == cells[i][0] && selectedY == cells[i][1]) {
                        array[selectedX - 1][selectedY - 1] = 'x';
                        consoleArray(array);
                        k++;
                        selection = true;
                        break;
                    }
                }

                if (!selection) {
                    System.out.println("you didn't hit the right spot, enter again:");
                    array[selectedX - 1][selectedY - 1] = '*';
                    consoleArray(array);
                }
                if (k == 3) {
                    System.out.println("You have won!");
                    break;
                }
            }

        }

    }

    private static void selectCells() {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '-';
            }
        }
        //we add 1 to the random ones because the points in the table start from one, not from zero
        int randomX = rnd.nextInt(array.length) + 1;
        int randomY = rnd.nextInt(array.length) + 1;
        int directionOfCells = rnd.nextInt(2); //this part determines whether it is horizontal or vertical.
        // 0 = horizontal and 1 = vertical

        if (directionOfCells == 0) { //vertical
            if (randomX == 1) {
                for (int i = 0; i < 3; i++) {
                    cells[i][0] = randomX + i;
                    cells[i][1] = randomY;
                }
            } else if (randomX == 5) {
                for (int i = 0; i < 3; i++) {
                    cells[i][0] = randomX - i;
                    cells[i][1] = randomY;
                }
            } else {
                for (int i = -1; i < 2; i++) {
                    cells[i + 1][0] = randomX + i;
                    cells[i + 1][1] = randomY;
                }

            }
        } else { //horizontally
            if (randomY == 1) {
                for (int i = 0; i < 3; i++) {
                    cells[i][0] = randomX;
                    cells[i][1] = randomY + i;

                }
            } else if (randomX == 5) {
                for (int i = 0; i < 3; i++) {
                    cells[i][0] = randomX;
                    cells[i][1] = randomY - i;
                }
            } else {
                for (int i = -1; i < 2; i++) {
                    cells[i + 1][0] = randomX;
                    cells[i + 1][1] = randomY + i;
                }

            }

        }

    }

    private static boolean checkingNumber(String enteredCells) {
        //Checks whether the value entered with this method is int and String
        boolean parse = enteredCells != " ";
        for (int i = 0; i < enteredCells.length(); i++) {
            parse = enteredCells.charAt(i) == '1' || enteredCells.charAt(i) == '2'
                    || enteredCells.charAt(i) == '3' || enteredCells.charAt(i) == '4' ||
                    enteredCells.charAt(i) == '5' || enteredCells.charAt(i) == '6' ||
                    enteredCells.charAt(i) == '7' || enteredCells.charAt(i) == '8' ||
                    enteredCells.charAt(i) == '9' || enteredCells.charAt(i) == '0';
        }
        return parse;
    }

    private static boolean ckechingInterval(int number) {
        // checks the value entered between 1 and 5
        return number <= 5 && number >= 1;
    }

    private static int check(String checkedNumber) {
        //this one combines and checks the two methods
        if (checkingNumber(checkedNumber)) {
            int selectedNumber = Integer.parseInt(checkedNumber);
            if (ckechingInterval(selectedNumber)) {
                return selectedNumber;
            } else {
                System.out.println("Number must be between 1 and 5, wrong answer");
                return -1;
            }
        } else {
            System.out.println("Please, enter a number:");
            return -1;

        }

    }
}
