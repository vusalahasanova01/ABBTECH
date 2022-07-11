package taskOne;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void chooseGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                let's start the game, Which game do you want to play?
                1.Guess Number
                2.Event Game
                Select the number according to the game you want to play:
                """);
        int enteredNumber = sc.nextInt();
        if (enteredNumber == 1) {
            guessNumber();
        } else if (enteredNumber == 2) {
            eventGame();
        } else {
            System.out.println("You did not enter the correct number, pls enter the correct number:");
            chooseGame();
        }
    }

    public static void eventGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name for game:");
        String nameEvent = sc.nextLine();
        String[][] event = {{"When did world war 2 start?", "When did world war 1 start?", "When did world war 1 stop?"},
                {"1939", "1914", "1918"}};
        Random random = new Random();
        int selectedQuestion = random.nextInt(event[0].length);
        while (true) {
            if (selectedQuestion == 0) {
                System.out.println(event[0][selectedQuestion]);
                String year = sc.nextLine();
                if (year.equals(event[1][selectedQuestion])) {
                    System.out.printf("Congrulations, %s", nameEvent);
                    break;
                } else {
                    System.out.println("Your answer wrong, pls enter true answer:");
                }
            }
        }
    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] array = new int[1];
        int[] arrayBackUp;
        int randomNumber = rnd.nextInt(100);
        System.out.println("Let the game begin");
        System.out.println("Enter your name for game: ");
        String name = sc.nextLine();
        int i = 0;
        while (true) {
            arrayBackUp = array;
            array = new int[1 + i];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = arrayBackUp[j];
            }
            int choosenNumber = checkingNumber();
            array[i++] = choosenNumber;
            if (choosenNumber == randomNumber) {
                System.out.printf("Congrulations, %s, ", name);
                array = sortingArray(array);
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k] + " ");
                }
                break;
            } else if (choosenNumber < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }

    }

    static int[] sortingArray(int[] arrTwo) {
        //With this method, I arrange the numbers in the array from largest to smallest.
        int maximum;
        for (int i = 0; i < arrTwo.length - 1; i++) {
            for (int j = i + 1; j < arrTwo.length; j++) {
                if (arrTwo[i] < arrTwo[j]) {
                    maximum = arrTwo[j];
                    arrTwo[j] = arrTwo[i];
                    arrTwo[i] = maximum;
                }
            }
        }
        return arrTwo;
    }

    static int checkingNumber() {
        //Checks whether the value entered with this method is int and String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String enteredNumber = sc.nextLine();
        boolean parse = true; // if parse == true, entered value is number, but parse == wrong entered value is String
        for (int i = 0; i < enteredNumber.length(); i++) {
            if (enteredNumber.charAt(i) != '1' && enteredNumber.charAt(i) != '2'
                    && enteredNumber.charAt(i) != '3' && enteredNumber.charAt(i) != '4' &&
                    enteredNumber.charAt(i) != '5' && enteredNumber.charAt(i) != '6' &&
                    enteredNumber.charAt(i) != '7' && enteredNumber.charAt(i) != '8' &&
                    enteredNumber.charAt(i) != '9' && enteredNumber.charAt(i) != '0') {
                parse = false;
            }
        }
        if (!parse) {
            //If it is a string, it asks to enter a number again
            System.out.println("Enter a number");
            return checkingNumber();
        } else {
            //If the entered value is a number,
            // I parse it as an int and test that it is between 0 and 100 and return it.
            int choosenNumber = Integer.parseInt(enteredNumber);
            if (choosenNumber > 100 || choosenNumber < 0) {
                System.out.println("Pls enter nnumber between 0 and 100");
                return checkingNumber();
            } else {
                return choosenNumber;
            }
        }

    }
}
