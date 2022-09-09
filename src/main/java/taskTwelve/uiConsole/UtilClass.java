package taskTwelve.uiConsole;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilClass {


    public int callResultInt(String question) {
        MenuUtil menuUtil = new MenuUtil();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(question);
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Please enter the correct values in the blanks.");
           return  callResultInt(question);
        }

    }

    public String callResultString(String question) {

        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        return sc.next();
    }
}
