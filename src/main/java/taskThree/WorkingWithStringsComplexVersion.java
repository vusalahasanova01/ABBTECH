package taskThree;

import java.util.Scanner;

public class WorkingWithStringsComplexVersion {
    private final static String[][] scedule = new String[7][2];
    private static boolean statement = true;

    public WorkingWithStringsComplexVersion() {
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "reading books";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "write task";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "write code";
        scedule[5][0] = "Friday";
        scedule[5][1] = "meet with friends";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "go to school";
    }

    private static void select() {
        while (statement) {
            System.out.println("Please, input the day of the week:");
            Scanner sc = new Scanner(System.in);
            String dayOfWeek = sc.nextLine().trim().toLowerCase();
            if (dayOfWeek.startsWith("change") || dayOfWeek.startsWith("reschedule")) {
                String[] dayOfSplit = dayOfWeek.split(" ");
                dayOfWeek = dayOfSplit[dayOfSplit.length - 1];
                changeDayOfWeek(dayOfWeek);
            } else {
                selectDayOfWeek(dayOfWeek);
            }

        }
    }

    public static void main(String[] args) {
        select();

    }

    private static void selectDayOfWeek(String dayOfSelect) {
        switch (dayOfSelect) {
            case "sunday":
                System.out.println(scedule[0][1]);
                break;
            case "monday":
                System.out.println(scedule[1][1]);
            case "tuesday":
                System.out.println(scedule[2][1]);
                break;
            case "wednesday":
                System.out.println(scedule[3][1]);
                break;
            case "thursday":
                System.out.println(scedule[4][1]);
                break;
            case "friday":
                System.out.println(scedule[5][1]);
                break;
            case "saturday":
                System.out.println(scedule[6][1]);
                break;

            default:
                System.out.println("Sorry, I don't understand you, please try again.");

        }
    }

    private static void changeDayOfWeek(String changeableDay) {
        Scanner sc = new Scanner(System.in);
        switch (changeableDay) {
            case "sunday":
                scedule[0][1] = sc.nextLine();
                break;
            case "monday":
                scedule[1][1] = sc.nextLine();

            case "tuesday":
                scedule[2][1] = sc.nextLine();
                break;
            case "wednesday":
                scedule[3][1] = sc.nextLine();
                break;
            case "thursday":
                scedule[4][1] = sc.nextLine();
                break;
            case "friday":
                scedule[4][1] = sc.nextLine();
                break;
            case "saturday":
                scedule[5][1] = sc.nextLine();
                break;
            case "exit":
                statement = false;

            default:
                System.out.println("Sorry, I don't understand you, please try again.");

        }

    }
}
