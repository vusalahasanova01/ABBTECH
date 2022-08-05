package TaskFive;


public class Main {
    public static void main(String[] args) {
        //Family1();
        System.out.println("-------------------------------------------------------------------------");
        //mainTwo();
        for (int i = 0; i < 1000000 ; i++) {
            Human human = new Human();
        }



    }


    public static void Family1() {
       Pet cat1 = new Pet("mila", Species.CAT, 3, 40, new String[]{"play,eating"}); //using empty constructor
        //using second consturctor
        Pet cat = new Pet ("duman", Species.CAT);

        // using third constructor
        Pet dog = new Pet("zevs", Species.CAT, 5, 50, new String[]{"eating",
                "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{DayOfWeek.MONDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{DayOfWeek.FRIDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre1 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{"Monday", "Reading book"}, {"Sunday", "Watching film"}});
        // Human zohre = new Human("Zohra", "Qafarova", 2001, mother, father);
        Family family1 = new Family(mother, father, dog, zohre1);
        Pet dog1 = new Pet("zevs", Species.CAT, 5, 50, new String[]{"eating",
                "playing"});
        Human mother1 = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{DayOfWeek.MONDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human father1 = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{DayOfWeek.FRIDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
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
        Pet dog1 = new Pet("zevs", Species.DOG, 5, 50, new String[]{"eating", "playing"});
        Human mother = new Human("Aypara", "Qafarova", 1977, 70, new String[][]{{"Monday",
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human father = new Human("Elvin", "Qafarov", 1971, 70, new String[][]{{DayOfWeek.SUNDAY.name(),
                "Reading book"},
                {"Sunday", "Watching film"}});
        Human zohre2 = new Human("Zohra", "Qafarova", 2001, 90,
                new String[][]{{DayOfWeek.SUNDAY.name(), "Reading book"}, {"Sunday", "Watching film"}});


    }

    public static void mainTwo() {

        Pet zevs = new Pet("zevs", Species.DOG, 2, 30, new String[]{"playing with people"});
        Pet mila = new Pet("mila", Species.CAT, 3, 50, new String[]{"eating", "playing"});
        Human nicat = new Human("Nicat", "Ahmedov", 2001, 50,
                new String[][]{{"Monday", "go to school"}, {DayOfWeek.SUNDAY.name(), "Reading book"}});
        Human revan = new Human("Revan", "Ahmedov", 2011, 35,
                new String[][]{{DayOfWeek.MONDAY.name(), "playing game"}, {"Sunday", "Reading book"}});

   }
}