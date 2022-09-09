package taskTwelve.uiConsole;

import taskTwelve.controller.FamilyController;
import taskTwelve.model.enums.DayOfWeek;
import taskTwelve.model.nonAbstarcts.Family;
import taskTwelve.model.nonAbstarcts.Man;
import taskTwelve.model.nonAbstarcts.Woman;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final FamilyController familyController = new FamilyController();

    public void showMenu() {
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


                    Woman zohre2 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                            Map.of(DayOfWeek.MONDAY, "Reading book", DayOfWeek.SUNDAY, "Watching film"));
                    Man elvin1 = new Man("Elvin", "Qafarov", "01/05/1971", 70,
                            Map.of(DayOfWeek.FRIDAY, "Reading book", DayOfWeek.SUNDAY, "Watching film"));
                    familyController.createNewFamily(zohre2, elvin1);
                    familyController.getFamilyById(1).addChild(new Woman("Revan","Qafarov",58,"12/10/2015"));
                    familyController.getFamilyById(1).bornChild("Sevinc","Ali");
                    familyController.getFamilyById(1).addChild(new Man("Nicat","Qafarov",45,"01/05/2000"));


                    Woman zohre3 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                            Map.of(DayOfWeek.MONDAY, "Reading book", DayOfWeek.SUNDAY, "Watching film"));
                    Man elvin2 = new Man("Elvin", "Qafarov", "01/05/1971", 70,
                            Map.of(DayOfWeek.FRIDAY, "Reading book", DayOfWeek.SUNDAY, "Watching film"));
                    familyController.createNewFamily(zohre3, elvin2);
                    familyController.getFamilyById(2)
                            .addChild(new Woman("Revan","Qafarov",58,"12/10/2020"));
                    familyController.getFamilyById(2)
                            .addChild(new Man("Nicat","Qafarov",45,"01/05/2010"));


                    System.out.println("Filled data completed!");
                    break;
                case "2":
                    displayFamilies();
                    break;
                case "3":
                    int specifiedBigNumber = util.callResultInt("Enter the specified number");
                    familyController.getFamiliesBiggerThan(specifiedBigNumber).stream()
                            .forEach(family -> System.out.println(family.prettyFormat()));
                    break;
                case "4":
                    int specifiedLessNumber = util.callResultInt("Enter the specified number");

                   familyController.getFamiliesLessThan(specifiedLessNumber).stream().
                           forEach(family -> System.out.println(family.prettyFormat()));
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
                    int iqOfFather = util.callResultInt("Enter father's iq ");
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
                    familyController.deleteFamilyByIndex(indexDeletedFamily-1);
                    System.out.println("Successfully deleted");
                    break;

                case "8":
                    menuUtil.editMenu();
                    String editMenuNumber = util.callResultString("Enter menu number for editing: ");
                        switch (editMenuNumber) {
                            case "1":
                                displayFamilies();
                                int idOfFamily = util.callResultInt("Enter family identifier (ID): ") - 1;
                                Family idOfFamilyObj = familyController.getFamilyById(idOfFamily);
                                String nameOfBoy = util.callResultString("Enter boy's name: ");
                                String nameOfGirl = util.callResultString("Enter girl's name: ");
                                familyController.bornChild(idOfFamilyObj, nameOfGirl, nameOfBoy);
                                break;
                            case "2":
                                System.out.println("Select gender of child: ");
                                menuUtil.selectGender();
                                String genderNumber = sc.next();
                                displayFamilies();
                                int idOfFamily2 = util.callResultInt("Enter family identifier (ID): ") - 1;
                                Family idOfFamilyObj2 = familyController.getFamilyById(idOfFamily2);
                                String nameOfChild = util.callResultString("Enter child's name: ");
                                String surnameOfChild = util.callResultString("Enter child's surname: ");
                                int birthday = util.callResultInt("Enter birthday of child: ");
                                int birthMonth = util.callResultInt("Enter birth month of child: ");
                                int birthYear = util.callResultInt("Enter birth year of child: ");
                                String  birthDate = String.format("%d/%d/%d", birthday, birthMonth, birthYear);
                                int iqOfChild = util.callResultInt("Enter iq of child: ");
                                if (genderNumber.equals("1")) {
                                    familyController.adoptChild(idOfFamilyObj2,
                                            new Man(nameOfChild, surnameOfChild, iqOfChild, birthDate));
                                } else {
                                    familyController.adoptChild(idOfFamilyObj2,
                                            new Woman(nameOfChild, surnameOfChild, iqOfChild, birthDate));
                                }
                                break;
                            case "3":
                                System.out.println("Returned to menu");
                                break;
                            default:
                                System.out.println("Input is invalid");

                        }
                        break;

                case "9":
                    System.out.println("Enter age for removing children: ");
                    int ageLimit = sc.nextInt();
                    familyController.deleteAllChildrenOlderThen(ageLimit);
                    break;
                case "exit":
                    System.out.println("Exit from the menu.");
                    result = false;
                    break;
                default:
                    System.out.println("Input is invalid");

            }

        }
    }

    public void displayFamilies(){
        int[] counter = {1};
        familyController.getAllFamilies().stream()
                .forEach(family -> System.out.println(counter[0]++ + ". " + family.prettyFormat()));
    }


}

