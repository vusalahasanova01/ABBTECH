package taskTwelve.uiConsole;

import taskTwelve.controller.FamilyController;
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
        UtilClass util = new UtilClass();
        MenuUtil menuUtil = new MenuUtil();
        boolean result = true;
        Scanner sc = new Scanner(System.in);
        while (result) {
            menuUtil.showMenu();
            System.out.println("Enter menu number:");
            String menuNumber = sc.nextLine();
            switch (menuNumber) {
                case "1":
                    Woman zohre1 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                            Map.of(DayOfWeek.MONDAY, "Reading book", DayOfWeek.SUNDAY, "Watching film"));
                    Man elvin = new Man("Elvin", "Qafarov", "01/05/1971", 70,
                            Map.of(DayOfWeek.FRIDAY, "Reading book", DayOfWeek.SUNDAY, "Watching film"));
                    familyController.createNewFamily(zohre1, elvin);
                    System.err.println("Filled data completed!");
                    break;
                case "2":
                    familyController.displayAllFamilies();
                    break;
                case "3":
                    int specifiedBigNumber = util.callResultInt("Enter the specified number");
                    System.out.println(familyController.getFamiliesBiggerThan(specifiedBigNumber));
                    break;
                case "4":
                    int specifiedLessNumber = util.callResultInt("Enter the specified number");
                    System.out.println(familyController.getFamiliesLessThan(specifiedLessNumber));
                case "5":
                    int sizeOfFamily = util.callResultInt("Enter the number:");
                    System.out.println(familyController.countFamiliesWithMemberNumber(sizeOfFamily));
                    break;
                case "6":

                    String motherName = util.callResultString("Enter mother's name: ");
                    String motherSurname = util.callResultString("Enter mother's surname: ");
                    int yearOfBirthdayMother = util.callResultInt("Enter birth year: ");
                    int montOfBirthdayMother = util.callResultInt("Enter birth of month: ");
                    int birthdayMother = util.callResultInt("Enter birthday: ");
                    int iqOfMother = util.callResultInt("Enter mother's iq ");
                    String birthdayOfMother = (birthdayMother)
                            + "/"
                            + montOfBirthdayMother
                            + "/" + yearOfBirthdayMother;


                    String fatherName = util.callResultString("Enter father's name: ");
                    String fatherSurname = util.callResultString("Enter father's surname: ");
                    int yearOfBirthdayFather = util.callResultInt("Enter birth year: ");
                    int montOfBirthdayFather = util.callResultInt("Enter birth of month: ");
                    int birthdayFather = util.callResultInt("Enter birthday: ");
                    int iqOfFather = util.callResultInt("Enter mother's iq ");
                    String birthdayOfFather = (birthdayFather)
                            + "/"
                            + montOfBirthdayFather
                            + "/" + yearOfBirthdayFather;
                    familyController.createNewFamily(new Woman(motherName, motherSurname, iqOfMother, birthdayOfMother),
                            new Man(fatherName, fatherSurname, iqOfFather, birthdayOfFather));
                    System.out.println("new famild was created.");
                    break;

                case "7":
                    int indexDeletedFamily = util.callResultInt("Add index for deleting family: ");
                    System.out.println(familyController.deleteFamilyByIndex(indexDeletedFamily));
                    break;

                case "8":
                    boolean result2 = true;
                    String editMenuNumber = util.callResultString("Enter menu number for editing: ");
                    while (result2) {
                        switch (editMenuNumber) {
                            case "1":
                                System.out.println("Enter family identifier (ID): ");
                                int idOfFamily = util.callResultInt("Enter family identifier (ID): ");
                                Family idOfFamilyObj = familyController.getFamilyById(idOfFamily);
                                String nameOfBoy = util.callResultString("Enter boy's name: ");
                                String nameOfGirl = util.callResultString("Enter girl's name: ");
                                System.out.println(familyController.bornChild(idOfFamilyObj, nameOfGirl, nameOfBoy));
                                break;
                            case "2":
                                System.out.println("Select gender of child: ");
                                menuUtil.selectGender();
                                String genderNumber = sc.next();
                                System.out.println("Enter family identifier (ID): ");
                                int idOfFamily2 = sc.nextInt();
                                Family idOfFamilyObj2 = familyController.getFamilyById(idOfFamily2);
                                System.out.println("Enter child's name: ");
                                String nameOfChild = sc.next();
                                System.out.println("Enter child's surname: ");
                                String surnameOfChild = sc.next();
                                System.out.println("Enter birthday of child: ");
                                String birthday = sc.next();
                                System.out.println("Enter iq of child: ");
                                int iqOfChild = sc.nextInt();
                                if (genderNumber.equals("1")) {
                                    System.out.println(familyController.adoptChild(idOfFamilyObj2,
                                            new Man(nameOfChild, surnameOfChild, iqOfChild, birthday)));
                                } else {
                                    System.out.println(familyController.adoptChild(idOfFamilyObj2,
                                            new Woman(nameOfChild, surnameOfChild, iqOfChild, birthday)));
                                }
                                break;
                            case "3":
                                result2 = false;
                                menuUtil.showMenu();
                                break;

                        }

                    }
                case "9":
                    System.out.println("Enter age for removing children: ");
                    int ageLimit = sc.nextInt();
                    familyController.deleteAllChildrenOlderThen(ageLimit);
                    break;
                case "10":
                case "exit":
                    System.out.println("Exit from the menu.");
                    result = false;

            }

        }
    }


}

