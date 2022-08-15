package taskEight;


import taskEight.enums.DayOfWeek;
import taskEight.nonAbstarcts.*;
import taskEight.taskSeven.nonAbstarcts.*;

public class Main {
    public static void main(String[] args) {
        //Family1();
        System.out.println("-------------------------------------------------------------------------");
        //mainTwo();
        //for (int i = 0; i < 1000000 ; i++) {
        //     Human human = new Human();
        // }
        // Human vusala =  new Human("Vusala", "Qafarova", 2001, 100,
        //          new String[][]{{DayOfWeek.MONDAY.name(), "Reading book"}, {DayOfWeek.SUNDAY.name(), "Watching film"}});

        // System.out.println(vusala);
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});

        System.out.println(dog);
    }


    public static void Family1() {
        RoboCat cat1 = new RoboCat("mila",3, 40, new String[]{"play,eating"}); //using empty constructor
        //using second consturctor
        RoboCat cat = new RoboCat("duman");

        // using third constructor
        Dog dog = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70, new String[][]{{DayOfWeek.MONDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Man father = new Man("Elvin", "Qafarov", 1971, 70, new String[][]{{DayOfWeek.FRIDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Woman zohre1 = new Woman("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        // Human zohre = new Human("Zohra", "Qafarova", 2001, mother, father);
        Family family1 = new Family(mother, father, dog, zohre1);
        Dog dog1 = new Dog("zevs", 5, 50, new String[]{"eating",
                "playing"});
        Woman mother1 = new Woman("Aypara", "Qafarova", 1977, 70, new String[][]{{DayOfWeek.MONDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Man father1 = new Man("Elvin", "Qafarov", 1971, 70, new String[][]{{DayOfWeek.FRIDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Woman zohre2 = new Woman("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        // Human zohre = new Human("Zohra", "Qafarova", 2001, mother, father);
        Family family2 = new Family(mother1, father1, dog1, zohre2);
        System.out.println(family2);
        System.out.println(family1);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(family1.equals(family2));

    }

    public static void Family2() {
       /* Pet cat3 = new Pet("mila", "cat", 3, 40, new String[]{"play,eating"}); //using empty constructor
        //using second constu rctor
        Pet cat4 = new Pet("duman", "cat");
        */
        // using third constructor
        Dog dog2 = new Dog("zevs", 5, 50, new String[]{"eating", "playing"});
        Woman mother = new Woman("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Man father = new Man("Elvin", "Qafarov", 1971, 70, new String[][]{{DayOfWeek.SUNDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Woman zohre2 = new Woman("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});


    }

    public static void mainTwo() {

        Dog dog2 = new Dog("zevs", 2, 30, new String[]{"playing with people"});
        DomesticCat mila = new DomesticCat("mila", 3, 50, new String[]{"eating", "playing"});
        Man nicat = new Man("Nicat", "Ahmedov", 2001, 50,
                new String[][]{{"Monday", "go to school"}, {DayOfWeek.SUNDAY.name(), "Reading book"}});
       Man revan = new Man("Revan", "Ahmedov", 2011, 35,
                new String[][]{{DayOfWeek.MONDAY.name(), "playing game"}, {"Sunday", "Reading book"}});

    }
}