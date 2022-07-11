package taskThree;

import java.util.Scanner;

public class WorkingWithStringsSimpleVersion {
    private final static Scanner sc = new Scanner(System.in);
    private final static String[][] scedule = new String[7][2];
    public WorkingWithStringsSimpleVersion(){
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
    public static void main(String[] args) {
        boolean statement = true;
        while (statement) {
            System.out.println("Please, input the day of the week:");

            String dayOfWeek = sc.nextLine();
            dayOfWeek = dayOfWeek.trim().toLowerCase();
            switch (dayOfWeek) {
                case "sunday":
                    System.out.println(scedule[0][1]);
                    break;
                case "monday":
                    System.out.println(scedule[1][1]);
                    break;
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
                case "exit":
                    statement = false;
                    break;

                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

            }

        }


    }

}
