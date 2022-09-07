package taskTwelve.uiConsole;


import TaskNine.controller.FamilyController;
import taskTwelve.model.abstracts.Human;
import taskTwelve.model.enums.DayOfWeek;
import taskTwelve.model.nonAbstarcts.Family;
import taskTwelve.model.nonAbstarcts.Man;
import taskTwelve.model.nonAbstarcts.Woman;

import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void showMenu() {
        FamilyController familyController = new FamilyController();
        MenuUtil menuUtil = new MenuUtil();
        boolean result = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter menu number:");
        String menuNumber = sc.nextLine();
        while (result) {
            menuUtil.showMenu();
            switch (menuNumber)
            {
                case "1":
                    Woman zohre1 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                            Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
                    Man elvin= new Man("Elvin", "Qafarov", "01/05/1971", 70,
                    Map.of(DayOfWeek.FRIDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
                    familyController.createNewFamily(zohre1,elvin);
            }

        }
    }
}
