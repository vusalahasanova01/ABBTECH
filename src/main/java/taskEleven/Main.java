package taskEleven;


import taskEleven.model.enums.DayOfWeek;
import taskEleven.model.nonAbstarcts.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


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
        Dog dog = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        System.out.println(dog);
    }


    public static void Family1() {
        RoboCat cat1 = new RoboCat("mila",3, 40,
                new HashSet<>(Arrays.asList("eating", "playing"))); //using empty constructor
        //using second consturctor
        RoboCat cat = new RoboCat("duman");

        // using third constructor
        Dog dog = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", "01/05/1977", 70,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));

        Man father = new Man("Elvin", "Qafarov", "01/05/1971", 70,
                Map.of(DayOfWeek.FRIDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre1 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        // Human zohre = new Human("Zohra", "Qafarova", 2001, mother, father);
        Family family1 = new Family(mother, father,new HashSet<>(List.of(dog)),List.of(zohre1));
        Dog dog1 = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));

        Woman mother1 = new Woman("Aypara", "Qafarova", "01/05/1977", 70,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));

        Man father1 = new Man("Elvin", "Qafarov", "01/05/1971", 70,
                Map.of(DayOfWeek.FRIDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));

        Woman zohre2 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        // Human zohre = new Human("Zohra", "Qafarova", 2001, mother, father);
        Family family2 = new Family(mother1, father1,new HashSet<>(List.of(dog1)) ,List.of(zohre2));
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
        Dog dog2 = new Dog("zevs", 5, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Woman mother = new Woman("Aypara", "Qafarova", "01/05/1977", 70,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Man father = new Man("Elvin", "Qafarov", "01/05/1971", 70,
                Map.of(DayOfWeek.SUNDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
        Woman zohre2 = new Woman("Zohra", "Qafarova", "17/12/2001", 90,
                Map.of(DayOfWeek.SUNDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));


    }

    public static void mainTwo() {

        Dog dog2 = new Dog("zevs", 2, 30, new HashSet<>(Arrays.asList("playing with people")));
        DomesticCat mila = new DomesticCat("mila", 3, 50,
                new HashSet<>(Arrays.asList("eating", "playing")));
        Man nicat = new Man("Nicat", "Ahmedov", "27/09/2001", 50,
                Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));
       Man revan = new Man("Revan", "Ahmedov", "08/01/2007", 35,
               Map.of(DayOfWeek.MONDAY,"Reading book", DayOfWeek.SUNDAY,"Watching film"));

    }
}